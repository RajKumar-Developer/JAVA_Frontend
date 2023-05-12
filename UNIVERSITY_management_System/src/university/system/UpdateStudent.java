package university.management.system;


import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class UpdateStudent implements ActionListener {

    JFrame f;
    JLabel id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12,  lab, lab2;
    JTextField  t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;
    JButton b, b1, b2;

    UpdateStudent() {

        f = new JFrame("Update Student details");
        f.setSize(900, 650);
        f.setLocation(300, 100);
        f.setBackground(Color.white);
        f.setLayout(null);

        JLabel l1 = new JLabel("Enter roll number to update the data of student");
        l1.setBounds(50, 100, 500, 30);
        l1.setFont(new Font("serif", Font.BOLD, 20));
        l1.setForeground(Color.WHITE);
        f.add(l1);

        t12 = new JTextField();
        t12.setBounds(500, 100, 200, 30);
        f.add(t12);

        b2 = new JButton("Update");
        b2.setBackground(Color.BLACK);
        b2.setBounds(720, 100, 100, 30);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        f.add(b2);
        b2.addActionListener(this);


        id8 = new JLabel("Update Student Details:");
        id8.setBounds(50, 10, 500, 50);
        id8.setFont(new Font("serif", Font.BOLD, 35));
        id8.setForeground(Color.WHITE);
        f.add(id8);


        id1 = new JLabel("Name");
        id1.setBounds(50, 170, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        id1.setForeground(Color.WHITE);
        f.add(id1);

        t1 = new JTextField();
        t1.setBounds(200, 170, 150, 30);
        f.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400, 170, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        id2.setForeground(Color.WHITE);
        f.add(id2);

        t2 = new JTextField();
        t2.setBounds(600, 170, 150, 30);
        f.add(t2);

        id3 = new JLabel("Age");
        id3.setBounds(50, 220, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        id3.setForeground(Color.WHITE);
        f.add(id3);

        t3 = new JTextField();
        t3.setBounds(200, 220, 150, 30);
        f.add(t3);

        id4 = new JLabel("DOB (dd/mm/yyyy)");
        id4.setBounds(400, 220, 200, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        id4.setForeground(Color.WHITE);
        f.add(id4);

        t4 = new JTextField();
        t4.setBounds(600, 220, 150, 30);
        f.add(t4);

        id5 = new JLabel("Address");
        id5.setBounds(50, 270, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        id5.setForeground(Color.WHITE);
        f.add(id5);

        t5 = new JTextField();
        t5.setBounds(200, 270, 150, 30);
        f.add(t5);

        id6 = new JLabel("Phone");
        id6.setBounds(400, 270, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        id6.setForeground(Color.WHITE);
        f.add(id6);

        t6 = new JTextField();
        t6.setBounds(600, 270, 150, 30);
        f.add(t6);

        id7 = new JLabel("Email Id");
        id7.setBounds(50, 320, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        id7.setForeground(Color.WHITE);
        f.add(id7);

        t7 = new JTextField();
        t7.setBounds(200, 320, 150, 30);
        f.add(t7);

        id9 = new JLabel("Class X(%)");
        id9.setBounds(400, 320, 130, 30);
        id9.setFont(new Font("serif", Font.BOLD, 20));
        id9.setForeground(Color.WHITE);
        f.add(id9);

        t8 = new JTextField();
        t8.setBounds(600, 320, 150, 30);
        f.add(t8);

        id10 = new JLabel("Class XII(%)");
        id10.setBounds(50, 370, 130, 30);
        id10.setFont(new Font("serif", Font.BOLD, 20));
        id10.setForeground(Color.WHITE);
        f.add(id10);

        t9 = new JTextField();
        t9.setBounds(200, 370, 150, 30);
        f.add(t9);


        id11 = new JLabel("Aadhar No");
        id11.setBounds(400, 370, 100, 30);
        id11.setFont(new Font("serif", Font.BOLD, 20));
        id11.setForeground(Color.WHITE);
        f.add(id11);

        t10 = new JTextField();
        t10.setBounds(600, 370, 150, 30);
        f.add(t10);

        id12 = new JLabel("Roll No");
        id12.setBounds(50, 420, 150, 30);
        id12.setFont(new Font("serif", Font.BOLD, 20));
        id12.setForeground(Color.WHITE);
        f.add(id12);

        t11 = new JTextField();
        t11.setBounds(200, 420, 150, 30);
        f.add(t11);


        lab = new JLabel("Course");
        lab.setBounds(400, 420, 150, 30);
        lab.setFont(new Font("serif", Font.BOLD, 20));
        lab.setForeground(Color.WHITE);
        f.add(lab);

        t13 = new JTextField();
        t13.setBounds(600, 420, 150, 30);
        f.add(t13);

        lab2 = new JLabel("Branch");
        lab2.setBounds(50, 470, 150, 30);
        lab2.setFont(new Font("serif", Font.BOLD, 20));
        lab2.setForeground(Color.WHITE);
        f.add(lab2);

        t14 = new JTextField();
        t14.setBounds(200, 470, 150, 30);
        f.add(t14);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setFont(new Font("serif", Font.BOLD, 20));
        b.setBounds(250, 520, 150, 40);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        f.add(b);
        b.addActionListener(this);

        b1 = new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("serif", Font.BOLD, 20));
        b1.setBounds(450, 520, 150, 40);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        f.add(b1);
        f.getContentPane().setBackground(new Color(170, 41, 80));
        f.setVisible(true);
    }

    private void b2ActionPerformed(ActionEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery("select * from student where rollno = '" + t12.getText() + "'");
            if (rs.next()) {
                f.setVisible(true);
                t1.setText(rs.getString("name"));
                t2.setText(rs.getString("fathers_name"));
                t3.setText(rs.getString("age"));
                t4.setText(rs.getString("dob"));
                t5.setText(rs.getString("address"));
                t6.setText(rs.getString("phone"));
                t7.setText(rs.getString("email"));
                t8.setText(rs.getString("class_x"));
                t9.setText(rs.getString("class_xii"));
                t10.setText(rs.getString("aadhar"));
                t11.setText(rs.getString("rollno"));
                t13.setText(rs.getString("course"));
                t14.setText(rs.getString("branch"));
            } else {
                JOptionPane.showMessageDialog(null, "No student found with roll number ='" + t12.getText() + "'");
            }
        } catch (Exception ignored) {}
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
            JOptionPane.showMessageDialog(f,"Enter class 10th mark");
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
            JOptionPane.showMessageDialog(f,"Enter roll number");
            return false;
        }
        if(t13.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter course");
            return false;
        }if(t14.getText().equals("")){
            JOptionPane.showMessageDialog(f,"Enter branch");
            return false;
        }
        return true;
    }

    private void bActionPerformed(ActionEvent evt) {
        if(check()){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
                String str = "update student set name='" + t1.getText() + "',fathers_name='" + t2.getText() + "',age='" + t3.getText() + "', dob='" + t4.getText() + "',address='" + t5.getText() + "',phone='" + t6.getText() + "',email='" + t7.getText() + "',class_x='" + t8.getText() + "',class_xii='" + t9.getText() + "',aadhar='" + t10.getText() + "',course='" + t13.getText() + "',branch='" + t14.getText() + "' where rollno='" + t12.getText() + "'";
                PreparedStatement pst = (PreparedStatement) cc.prepareStatement(str);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "successfully updated");
                f.setVisible(false);
                new StudentDetails();
            } catch (Exception e) {
                System.out.println("The error is:" + e);
            }
        }
    }

    private void b1ActionPerformed(ActionEvent evt) {
        f.setVisible(false);
        new Project().setVisible(true);
    }
    public static void main(String[] arg){
        new UpdateStudent().f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}