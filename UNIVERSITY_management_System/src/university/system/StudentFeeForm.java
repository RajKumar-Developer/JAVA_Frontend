package university.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
public class StudentFeeForm extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4;
    private JComboBox comboBox, comboBox1, comboBox2;
    JButton b1,b2,b3;

    public static void main(String[] args) {
        new StudentFeeForm().setVisible(true);
    }


    public StudentFeeForm() {
        super("Student Fee Form");
	setBounds(500, 200, 500, 450);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
	t1 = new JTextField();
	t1.setForeground(Color.BLACK);
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));

        
	JLabel l1 = new JLabel("Select Roll No");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(Color.white);
	l1.setBounds(64, 63, 102, 22);
	contentPane.add(l1);

		b3 = new JButton("Enter");
		b3.addActionListener(this);
		b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b3.setBounds(333, 61, 111, 30);
		b3.setBackground(Color.BLACK);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b3ActionPerformed(evt);
			}
		});
		contentPane.add(b3);

	JLabel l2 = new JLabel("Name");
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(64, 97, 102, 22);
	l2.setForeground(Color.white);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Father's Name");
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setForeground(Color.white);
	l3.setBounds(64, 130, 102, 22);
	contentPane.add(l3);

	JLabel l7 = new JLabel("Course");
	l7.setForeground(Color.white);
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(64, 173, 102, 22);
	contentPane.add(l7);

	JLabel l4 = new JLabel("Branch");
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setForeground(Color.white);
	l4.setBounds(64, 209, 102, 22);
	contentPane.add(l4);

        JLabel l5 = new JLabel("Semester");
	l5.setForeground(Color.white);
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(64, 242, 102, 22);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Total Payable");
	l6.setForeground(Color.white);
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(64, 275, 102, 22);
	contentPane.add(l6);

	t1.setBounds(174, 66, 156, 20);
	contentPane.add(t1);

	t2 = new JTextField();
	t2.setForeground(Color.BLACK);
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(174, 100, 156, 20);
	contentPane.add(t2);

	t3 = new JTextField();
	t3.setForeground(Color.BLACK);
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(174, 133, 156, 20);
	contentPane.add(t3);




	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Electronics","Computer Science","Electrical","Mechanical","Civil"}));
	comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox.setForeground(Color.BLACK);
	comboBox.setBounds(176, 211, 154, 20);
	contentPane.add(comboBox);


	comboBox1 = new JComboBox();
	comboBox1.setModel(new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
	comboBox1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox1.setForeground(Color.BLACK);
	comboBox1.setBounds(176, 244, 154, 20);
	contentPane.add(comboBox1);
        
	t4 = new JTextField();
	t4.setForeground(Color.BLACK);
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(176, 275, 154, 20);
        add(t4);
        
	b1 = new JButton("Pay");
	b1.addActionListener(this);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(64, 321, 111, 33);
	b1.setBackground(Color.BLACK);
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
				b1ActionPerformed(evt);
			}
		});
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBounds(198, 321, 111, 33);
	b2.setBackground(Color.BLACK);
	b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			b2ActionPerformed(evt);
		}
	});
	contentPane.add(b2);

	comboBox2 = new JComboBox();
	comboBox2.setModel(new DefaultComboBoxModel(new String[] {"M.Tech","B.Tech","BCA","Bsc","MBA"}));
	comboBox2.setForeground(Color.BLACK);
	comboBox2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox2.setBounds(176, 176, 154, 20);
	contentPane.add(comboBox2);

	JPanel panel = new JPanel();
	contentPane.setBackground(new Color(170, 41, 80));
	panel.setBackground(Color.WHITE);
	contentPane.add(panel);
    }

	private void b3ActionPerformed(ActionEvent evt) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
				Statement st = cc.createStatement();
				ResultSet rs = st.executeQuery("select * from student where rollno = '"+ t1.getText()+"'");
				if(rs.next()){
					String course = rs.getString("course");
					String branch = rs.getString("branch");
					t2.setText(rs.getString("name"));
					t3.setText(rs.getString("fathers_name"));
					comboBox2.setSelectedItem(course);
    				comboBox.setSelectedItem(branch);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	private void b2ActionPerformed(ActionEvent evt) {
		this.setVisible(false);
	}
	public void b1ActionPerformed(ActionEvent ae){
		String a = t1.getText();
		String bb = t2.getText();
		String c = t3.getText();
		String d = (String) comboBox2.getSelectedItem();
		String ee = (String)comboBox.getSelectedItem();
		String ff = (String) comboBox1.getSelectedItem();
		String g = t4.getText();
        try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
			String sql = "insert into fee(rollno, name, fathers_name, course, branch, semester, fee_paid) values('" + a + "','" + bb + "','" + c + "','" + d + "','" + ee + "','" + ff + "','" + g + "')";
			PreparedStatement st = (PreparedStatement) cc.prepareStatement(sql);
			JOptionPane.showMessageDialog(null, "Successfully Paid");
			this.setVisible(false);

		}catch(Exception e){
				System.out.println("The error is:" + e);
			}
		}
	@Override
	public void actionPerformed(ActionEvent e) {}
}

