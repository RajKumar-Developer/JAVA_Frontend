
package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class StudentDetails extends JFrame implements ActionListener{

    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String[] x = {"Name","Father's Name","Age","Date of Birth","Address","Phone","Email","Class X(%)", "Class XII(%)", "Aadhar No","Roll No","Course","Branch"};
    String[][] y = new String[20][13];
    int i=0, j=0;
    StudentDetails(){
        super("Student Details");
        setSize(1260,650);
        setLocation(100,100);
        setLayout(null);

        l1 = new JLabel("Enter roll number to delete Student : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        l1.setForeground(Color.WHITE);
        add(l1);

        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);

        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setBounds(620, 360, 100 ,30);
        b1.addActionListener(this);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        add(b1);

        l2 = new JLabel("Add New Student");
        l2.setBounds(50,450,400,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        l2.setForeground(Color.WHITE);
        add(l2);

        b2 = new JButton("Add Student");
        b2.setBackground(Color.BLACK);
        b2.setBounds(300, 450, 150 ,30);
        b2.addActionListener(this);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        add(b2);

        l3 = new JLabel("Update Student Details");
        l3.setBounds(50,490,400,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        l3.setForeground(Color.WHITE);
        add(l3);

        b3 = new JButton("Update Student");
        b3.setBackground(Color.BLACK);
        b3.setBounds(300, 490, 150 ,30);
        b3.addActionListener(this);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData meta = rs.getMetaData();
            int columnCount = meta.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(meta.getColumnName(i));
            }
            while(rs.next()){
                model.addRow(new String[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                });
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("fathers_name");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("class_x");
                y[i][j++]=rs.getString("class_xii");
                y[i][j++]=rs.getString("aadhar");
                y[i][j++]=rs.getString("rollno");
                y[i][j++]=rs.getString("course");
                y[i][j++]=rs.getString("branch");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);

        }catch(Exception e){
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        add(sp);
        getContentPane().setBackground(new Color(170, 41, 80));
        b1.addActionListener(this);
    }

    private void b3ActionPerformed(ActionEvent evt) {
        new UpdateStudent().f.setVisible(true);
        this.setVisible(false);
    }

    private void b2ActionPerformed(ActionEvent evt) {
        new AddStudent().f.setVisible(true);
        this.setVisible(false);
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
                String a = t2.getText();
                String q = "delete from student where rollno = '"+a+"'";
                PreparedStatement pst = (PreparedStatement) cc.prepareStatement(q);
                pst.executeUpdate();
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            }catch(Exception ignored){}
    }
    public static void main(String[] args){
        new StudentDetails().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
