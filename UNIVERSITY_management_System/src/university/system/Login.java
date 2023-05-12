package university.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;

public class Login extends JFrame implements ActionListener{

    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    Login(){

        super("Login");

        setBackground(Color.white);
        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(150,300,100,40);
        l1.setFont(new Font("serif",Font.PLAIN,18));
        l1.setForeground(Color.white);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(150,370,100,30);
        l2.setFont(new Font("serif",Font.PLAIN,18));
        l2.setForeground(Color.white);


        add(l2);
 
        t1=new JTextField();
        t1.setBounds(250,306,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(250,370,150,30);
        add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/Second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(240,180,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(50,20,500,300);
        add(l3);


        b1=new JButton("Login");
        b1.setBounds(150,440,120,35);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(272,440,120,35);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        add(b2);

        getContentPane().setBackground(new Color(170, 41, 80));
        setVisible(true);
        setSize(600,600);
        setLocation(450,100);
    }

    private void b2ActionPerformed(ActionEvent evt) {
        this.dispose();
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        try{
            String u = t1.getText();
            String v = t2.getText();

            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
            String q = "select * from userdetails where username= '"+u+"' and password='"+v+"'";
            PreparedStatement pst = (PreparedStatement) c.prepareStatement(q);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                new Project().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(true);
                t1.setText("");
                t2.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }



    public static void main(String[] arg){
        Login l = new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
}