package university.management.system;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class TeacherAttendance extends JFrame implements ActionListener{
    
    JLabel l,l1,l2,l3;
    JTextField t1;
    JButton b1,b2;
    Choice c2,fh,sh;
    
    TeacherAttendance(){
        super("Teacher Attendance");
        setLayout(new GridLayout(5,2,50,50));
        c2 = new Choice();
        c2.setForeground(Color.BLACK);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery("select emp_id from teacher");

            while(rs.next()){
                c2.add(rs.getString("emp_id"));    
            }
      
      
       }catch(Exception e){ }
        l=new JLabel("\t\t\t\t\t\tSelect Empolyee ID");
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
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.addActionListener(this);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("serif",Font.BOLD,20));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setBackground(new Color(170, 41, 80));

        setVisible(true);
        setSize(600,450);
        setLocation(350,200);

    }

    private void b2ActionPerformed(ActionEvent evt) {
        this.dispose();
    }

    public void b1ActionPerformed(ActionEvent ae){
       
        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id=c2.getSelectedItem();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
            String qry = "insert into attendance_teacher values("+ id +",'"+dt+"','"+f+"','"+s+"')";
            PreparedStatement pst = (PreparedStatement) cc.prepareStatement(qry);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Attendance confirmed");

            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    
    public static void main(String s[]){
        new TeacherAttendance();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

