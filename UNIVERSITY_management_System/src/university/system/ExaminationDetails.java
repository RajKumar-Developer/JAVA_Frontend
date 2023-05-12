package university.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener{
    String s;
   private final JPanel contentPane;
   private final JTable table;
   private final JTextField search;
   private final JButton b1;


    public void Book() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            TableModel tableModel = DbUtils.resultSetToTableModel(rs);
            table.setModel(tableModel);
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ignored) {
        }
    }

   public ExaminationDetails() {
       super("Examination Details");
        setBounds(150, 100, 930, 475);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(170, 41, 80));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79, 133, 1080, 282);
        contentPane.add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
               int row = table.getSelectedRow();
               search.setText(table.getModel().getValueAt(row, 10).toString());
            }
        });
       
        table.setBackground(new Color(240, 248, 255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        scrollPane.setViewportView(table);

        b1 = new JButton("Result");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(564, 89, 138, 33);
       b1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               b1ActionPerformed(evt);
           }
       });
       contentPane.add(b1);
       
        JLabel l1 = new JLabel("Check Result");
        l1.setForeground(Color.white);
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(300, 15, 400, 47);
        contentPane.add(l1);

       
        search = new JTextField();
        search.setBackground(new Color(255, 240, 245));
        search.setForeground(Color.BLACK);
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(189, 89, 357, 33);
        contentPane.add(search);
        search.setColumns(10);

        JLabel l3 = new JLabel("Back");
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
       l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l3.setBounds(97, 89, 72, 33);
        contentPane.add(l3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3, true), "Details",
        TitledBorder.LEADING, TitledBorder.TOP, null, Color.GRAY));
        panel.setBounds(67, 54, 1100, 368);
        contentPane.add(panel);
        panel.setBackground(new Color(170, 41, 80));
        Book();
        setSize(1200,700);

    }

        public void b1ActionPerformed(ActionEvent evt) {
            s = search.getText();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
                Statement stmt = cc.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT * FROM marks where rollno= '"+s+"'");

                DefaultTableModel model = new DefaultTableModel();

                ResultSetMetaData meta = rs.getMetaData();
                int columnCount = meta.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    model.addColumn(meta.getColumnName(i));
                }

                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }
                JTable table = new JTable(model);

                JScrollPane scrollPane = new JScrollPane(table);

                JFrame frame = new JFrame("Marks");
                frame.setLayout(new BorderLayout());
                frame.add(scrollPane, BorderLayout.CENTER);
                frame.setSize(500, 200);
                frame.setVisible(true);

            } catch (Exception ignored) {
            }
        }

    public static void main(String[] args) {
        new ExaminationDetails().setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}