package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendance extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l;
    JTextField t1;
    JButton b1,b2;
    Choice c2,fh,sh;
    
    StudentAttendance(){
        super("Student Attendance");
        setLayout(new GridLayout(5,2,40,45));
        c2 = new Choice();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery("select rollno from student");
            while(rs.next()){
                c2.add(rs.getString("rollno"));
            }
       }catch(Exception ignored){ }

        l=new JLabel("\t\t\t\t\t\tSelect Roll Number");
        l.setFont(new Font("serif",Font.BOLD,18));
        l.setForeground(Color.WHITE);
        add(l);
        add(c2);
      
        l1 = new JLabel("\t\t\t\t\t\tFirst Half");
        l1.setFont(new Font("serif",Font.BOLD,18));
        l1.setForeground(Color.WHITE);
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("OD");

        add(l1);
        add(fh);
        
        l2 = new JLabel("\t\t\t\t\t\tSecond Half");
        l2.setFont(new Font("serif",Font.BOLD,18));
        l2.setForeground(Color.WHITE);
        sh = new Choice();
        sh.add("Present");
        sh.add("Absent");
        sh.add("OD");
       
        add(l2);
        add(sh);

        l3 = new JLabel("\t\t\t\t\t\tDate(dd/mm/yyyy)");
        l3.setFont(new Font("serif",Font.BOLD,18));
        l3.setForeground(Color.WHITE);
        t1=new JTextField();

        add(l3);
        add(t1);
       
        b1 =new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("serif",Font.BOLD,18));
        b1.addActionListener(this);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("serif",Font.BOLD,18));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(new Color(170, 41, 80));
        
        setVisible(true);
        setSize(600,450);
        setLocation(350,200);
       
    }

    public void b1ActionPerformed(ActionEvent ae){

        String id=c2.getSelectedItem();
        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = t1.getText();


        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3307/UMS", "root", "");
            String qry = "insert into attendance_student values("+ id +",'"+dt+"','"+f+"','"+s+"')";
            PreparedStatement pst = (PreparedStatement) cc.prepareStatement(qry);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Attendance confirmed");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }


    }
    private void b2ActionPerformed(ActionEvent evt) {
        this.dispose();
    }
    
    public static void main(String[] s){
        new StudentAttendance();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
