package university.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.*;

class AddTeacher implements ActionListener{

    JFrame f;
    JLabel id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id15,lab,lab2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b,b1;
    JComboBox c1,c2;

    
      
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    AddTeacher(){
        f = new JFrame("Add Teacher");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);

        id8 = new JLabel("New Teacher Details");
        id8.setBounds(320,50,500,50);
        id8.setFont(new Font("serif", Font.BOLD,25));
        id8.setForeground(Color.WHITE);
        id15.add(id8);
        f.add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id1.setForeground(Color.WHITE);
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id2.setForeground(Color.WHITE);
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id3.setForeground(Color.WHITE);
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id4.setForeground(Color.WHITE);
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id5.setForeground(Color.WHITE);
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id6.setForeground(Color.WHITE);
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id7.setForeground(Color.WHITE);
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        id15.add(t7);

        id8= new JLabel("Class X(%)");
        id8.setBounds(400,300,130,30);
        id8.setFont(new Font("serif",Font.BOLD,20));
        id8.setForeground(Color.WHITE);
        id15.add(id8);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        id15.add(t8);

        id9= new JLabel("Class XII(%)");
        id9.setBounds(50,350,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));
        id9.setForeground(Color.WHITE);
        id15.add(id9);

        t9=new JTextField();
        t9.setBounds(200,350,150,30);
        id15.add(t9);


        id10= new JLabel("Aadhar No");
        id10.setBounds(400,350,100,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id10.setForeground(Color.WHITE);
        id15.add(id10);

        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        id15.add(t10);

        lab=new JLabel("Education");
        lab.setBounds(50,400,150,30);
	lab.setFont(new Font("serif",Font.BOLD,20));
        lab.setForeground(Color.WHITE);
        id15.add(lab);
            
        String[] course = {"B.Tech","M.Tech","BCA","Bsc","MBA"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200,400,150,30);
        id15.add(c1);
        
        lab2=new JLabel("Department");
        lab2.setBounds(400,400,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        lab2.setForeground(Color.WHITE);
        id15.add(lab2);
        
        String[] branch = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(600,400,150,30);
        id15.add(c2);
        
        id11= new JLabel("Emp id");
        id11.setBounds(400,450,150,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id11.setForeground(Color.white);
        id15.add(id11);

        t11=new JTextField();
        t11.setText("101"+first);
        t11.setBounds(600,450,150,30);
        id15.add(t11);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setFont(new Font("serif",Font.BOLD,20));
        b.setBounds(250,550,150,40);
        b.addActionListener(this);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.setBounds(450,550,150,40);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(320,100);
        f.getContentPane().setBackground(new Color(170, 41, 80));

    }
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
        f.dispose();

    }
    public boolean check(){
        if(t1.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter name");
            return false;
        }
        if(t2.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter father's name");
            return false;
        }
        if(t3.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter age");
            return false;
        }
        if(t4.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "Enter DOB");
            return false;
        }
        if(t5.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter address");
            return false;
        }
        if(t6.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter contact number");
            return false;
        }
        if(t7.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter email id");
            return false;
        }
        if(t8.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter class 10th mark ");
            return false;
        }
        if(t9.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter class 12th mark");
            return false;
        }
        if(t10.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter aadhar");
            return false;
        }
        if(t11.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter Employee ID");
            return false;
        }
        return true;
    }
    private void bActionPerformed(java.awt.event.ActionEvent evt) {
        String a = t1.getText();//name
        String bb = t2.getText();//fathers name
        String c = t3.getText();//age
        String d = t4.getText();//dob
        String e = t5.getText();//address
        String ff = t6.getText();//phone
        String g = t7.getText();//email
        String h = t8.getText();//class 10
        String i = t9.getText();//class 12
        String j = t10.getText();//aadhar
        String k = (String) c1.getSelectedItem();//course
        String l = t11.getText();//emp id
        String m = (String) c2.getSelectedItem();//department

        if (check()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
                String q = "insert into teacher(name,fathers_name,age,dob,address,phone,email,class_x,class_xii,aadhar,course,emp_id,dep) values('" + a + "','" + bb + "','" + c + "','" + d + "','" + e + "','" + ff + "','" + g + "','" + h + "','" + i + "','" + j + "','" + k + "','" + l + "','" + m + "')";
                PreparedStatement pst = (PreparedStatement) cc.prepareStatement(q);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                f.setVisible(false);

            } catch (Exception ee) {
                System.out.println("The error is:" + ee);
            }
        }
    }

    public static void main(String[] arg){
        new AddTeacher().f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}