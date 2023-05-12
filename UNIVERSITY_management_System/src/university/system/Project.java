package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        super("University Management System");
        setSize(1920,1030);

        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/aa.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1742, 899,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);

        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        JMenu add = new JMenu("Add");
        JMenuItem m1 = new JMenuItem("New Student");
        JMenuItem m2 = new JMenuItem("New Faculty");



        m1.setFont(new Font("monospaced",Font.BOLD,16));
        m1.setForeground(Color.RED);
        m1.setBackground(Color.WHITE);

        m2.setFont(new Font("monospaced",Font.BOLD,16));
        m2.setForeground(Color.RED);
        m2.setBackground(Color.WHITE);
        

        m2.addActionListener(this);
        m1.addActionListener(this);
        add.add(m1);
        add.add(m2);


        JMenu user = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");

        u1.setFont(new Font("monospaced",Font.BOLD,16));
        u1.setForeground(Color.red);
        u1.setBackground(Color.WHITE);

        u2.setFont(new Font("monospaced",Font.BOLD,16));
        u2.setForeground(Color.red);
        u2.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        user.add(u1);
        user.add(u2);

        JMenu attendance = new JMenu("Attendance");
        JMenuItem a1 = new JMenuItem("Student Attendance");
        JMenuItem a2 = new JMenuItem("Teacher Attendance");
        attendance.setForeground(Color.BLUE);
        
        a1.setFont(new Font("monospaced",Font.BOLD,16));
        a1.setForeground(Color.RED);
        attendance.add(a1);
        
        a2.setFont(new Font("monospaced",Font.BOLD,16));
        a2.setForeground(Color.RED);
        attendance.add(a2);

        a1.addActionListener(this);
        a2.addActionListener(this);



        JMenu attendance_detail = new JMenu("Attendance Detail");
        JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");
        attendance_detail.setForeground(Color.RED);
        
        b1.setFont(new Font("monospaced",Font.BOLD,16));
        b1.setForeground(Color.RED);
        attendance_detail.add(b1);
        
        b2.setFont(new Font("monospaced",Font.BOLD,16));
        b2.setForeground(Color.RED);
        attendance_detail.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        JMenu exam = new JMenu("Examination");
        JMenuItem c1 = new JMenuItem("Examination Details");
        JMenuItem c2 = new JMenuItem("Enter Marks");
        exam.setForeground(Color.BLUE);

        c1.setFont(new Font("monospaced",Font.BOLD,16));
        c1.setForeground(Color.RED);
        exam.add(c1);

        c2.setFont(new Font("monospaced",Font.BOLD,16));
        c2.setForeground(Color.RED);
        exam.add(c2);

        c1.addActionListener(this);
        c2.addActionListener(this);

        JMenu report = new JMenu("Update Details");
        JMenuItem r1 = new JMenuItem("Update Students");
        JMenuItem r2 = new JMenuItem("Update Teachers");
        report.setForeground(Color.RED);

        r1.setFont(new Font("monospaced",Font.BOLD,16));
        r1.setForeground(Color.RED);
        r1.addActionListener(this);

        r2.setFont(new Font("monospaced",Font.BOLD,16));
        r2.setForeground(Color.RED);
        r2.addActionListener(this);

        report.add(r1);
        report.add(r2);



        JMenu fee = new JMenu("Fee Details");
        JMenuItem s1 = new JMenuItem("Fee Structure");
        JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.BLUE);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
        s1.setForeground(Color.RED);
        s1.addActionListener(this);
        
        s2.setFont(new Font("monospaced",Font.BOLD,16));
        s2.setForeground(Color.RED);
        s2.addActionListener(this);
        fee.add(s1);
        fee.add(s2);

        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);

        

        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ex.setForeground(Color.RED);
        ex.addActionListener(this);
        exit.add(ex);

        mb.add(add);
        mb.add(user);
        mb.add(report);
        mb.add(attendance);
        mb.add(attendance_detail);
        mb.add(exam);
        mb.add(fee);
        mb.add(exit);

        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        switch (msg) {
            case "New Student" -> new AddStudent().f.setVisible(true);
            case "New Faculty" -> new AddTeacher().f.setVisible(true);
            case "Student Details" -> new StudentDetails().setVisible(true);
            case "Teacher Details" -> new TeacherDetails().setVisible(true);
            case "Update Students" -> new UpdateStudent().f.setVisible(true);
            case "Update Teachers" -> new UpdateTeacher().f.setVisible(true);
            case "Fee Structure" -> new FeeStructure().setVisible(true);
            case "Student Fee Form" -> new StudentFeeForm().setVisible(true);
            case "Exit" -> System.exit(0);
            case "Student Attendance" -> new StudentAttendance().setVisible(true);
            case "Teacher Attendance" -> new TeacherAttendance().setVisible(true);
            case "Student Attendance Detail" -> new StudentAttendanceDetail().setVisible(true);
            case "Teacher Attendance Detail" -> new TeacherAttendanceDetail().setVisible(true);
            case "Examination Details" -> new ExaminationDetails().setVisible(true);
            case "Enter Marks" -> new EnterMarks().setVisible(true);
        }
    }


    public static void main(String[] args){
        new Project().setVisible(true);
    }
    
}
