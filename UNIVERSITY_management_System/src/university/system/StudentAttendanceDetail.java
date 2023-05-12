package university.management.system;

import java.awt.print.PrinterException;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendanceDetail extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String[] h ={"Roll Number","Date Time","First Half","Second Half"};
    String [][] d=new String[35][4];
    int i=0,j=0;
    
    StudentAttendanceDetail(){
        super("View Students Attendence");
        setSize(550,500);
        setLocation(450,150);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "");
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery("select * from attendance_student");
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
                });
            d[i][j++]=rs.getString("rollno");
                d[i][j++]=rs.getString("Date");
                d[i][j++]=rs.getString("first");
                d[i][j++]=rs.getString("second");
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);
            j1.setBackground(new Color(170, 41, 80));
            j1.setForeground(Color.white);

        }catch(Exception ignored){}
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae){
        try {
            boolean complete = j1.print();
            if (complete) {
                JOptionPane.showMessageDialog(null, "Printing Complete", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Printing Cancelled", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Printer Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args){
        new StudentAttendanceDetail().setVisible(true);
    }
}