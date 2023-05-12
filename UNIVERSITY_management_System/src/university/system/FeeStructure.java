package university.management.system;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame{
    
    JLabel l1,l2,l3,l4,l5,l6,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4;
    
    public FeeStructure(){
        
        setSize(1250,750);
        setLocation(100,50);
        setLayout(null);
        
        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.BOLD,50));
        i1.setBounds(500,10,400,70);
        i1.setForeground(Color.WHITE);
        add(i1);
        
        l1 = new JLabel("Course");
        l1.setBounds(80,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,26));
        l1.setForeground(Color.WHITE);
        add(l1);
        
        l2 = new JLabel("BTech");
        l2.setBounds(280,100,100,40);
        l2.setFont(new Font("serif",Font.BOLD,26));
        l2.setForeground(Color.WHITE);
        add(l2);

        b1 = new JLabel("Rs 430000");
        b1.setBounds(280,170,150,40);
        b1.setFont(new Font("serif",Font.PLAIN,26));
        b1.setForeground(Color.WHITE);
        add(b1);

        b2 = new JLabel("Rs 430000");
        b2.setBounds(280,240,150,40);
        b2.setFont(new Font("serif",Font.PLAIN,26));
        b2.setForeground(Color.WHITE);
        add(b2);

        b3 = new JLabel("Rs 430000");
        b3.setBounds(280,310,150,40);
        b3.setFont(new Font("serif",Font.PLAIN,26));
        b3.setForeground(Color.WHITE);
        add(b3);

        b4 = new JLabel("Rs 430000");
        b4.setBounds(280,380,150,40);
        b4.setFont(new Font("serif",Font.PLAIN,26));
        b4.setForeground(Color.WHITE);
        add(b4);

        b5 = new JLabel("Rs 430000");
        b5.setBounds(280,450,150,40);
        b5.setFont(new Font("serif",Font.PLAIN,26));
        b5.setForeground(Color.WHITE);
        add(b5);

        b6 = new JLabel("Rs 430000");
        b6.setBounds(280,520,150,40);
        b6.setFont(new Font("serif",Font.PLAIN,26));
        b6.setForeground(Color.WHITE);
        add(b6);

        b7 = new JLabel("Rs 430000");
        b7.setBounds(280,590,150,40);
        b7.setFont(new Font("serif",Font.PLAIN,26));
        b7.setForeground(Color.WHITE);
        add(b7);

        b8 = new JLabel("Rs 430000");
        b8.setBounds(280,660,150,40);
        b8.setFont(new Font("serif",Font.PLAIN,26));
        b8.setForeground(Color.WHITE);
        add(b8);


        l3 = new JLabel("MTech");
        l3.setBounds(480,100,100,40);
        l3.setFont(new Font("serif",Font.BOLD,26));
        l3.setForeground(Color.WHITE);
        add(l3);

        bb1 = new JLabel("Rs 320000");
        bb1.setBounds(480,170,150,40);
        bb1.setFont(new Font("serif",Font.PLAIN,26));
        bb1.setForeground(Color.WHITE);
        add(bb1);

        bb2 = new JLabel("Rs 320000");
        bb2.setBounds(480,240,150,40);
        bb2.setFont(new Font("serif",Font.PLAIN,26));
        bb2.setForeground(Color.WHITE);
        add(bb2);

        bb3 = new JLabel("Rs 320000");
        bb3.setBounds(480,310,150,40);
        bb3.setFont(new Font("serif",Font.PLAIN,26));
        bb3.setForeground(Color.WHITE);
        add(bb3);

        bb4 = new JLabel("Rs 320000");
        bb4.setBounds(480,380,150,40);
        bb4.setFont(new Font("serif",Font.PLAIN,26));
        bb4.setForeground(Color.WHITE);
        add(bb4);

        bb17 = new JLabel("Rs 320000");
        bb17.setBounds(480,450,150,40);
        bb17.setFont(new Font("serif",Font.PLAIN,26));
        bb17.setForeground(Color.WHITE);
        add(bb17);

        bb18 = new JLabel("Rs 320000");
        bb18.setBounds(480,520,150,40);
        bb18.setFont(new Font("serif",Font.PLAIN,26));
        bb18.setForeground(Color.WHITE);
        add(bb18);

        l4 = new JLabel("BCA");
        l4.setBounds(680,100,100,40);
        l4.setFont(new Font("serif",Font.BOLD,26));
        l4.setForeground(Color.WHITE);
        add(l4);
        
        bb5 = new JLabel("Rs 250000");
        bb5.setBounds(680,170,150,40);
        bb5.setFont(new Font("serif",Font.PLAIN,26));
        bb5.setForeground(Color.WHITE);
        add(bb5);
        
        bb6 = new JLabel("Rs 250000");
        bb6.setBounds(680,240,150,40);
        bb6.setFont(new Font("serif",Font.PLAIN,26));
        bb6.setForeground(Color.WHITE);
        add(bb6);
        
        bb7 = new JLabel("Rs 250000");
        bb7.setBounds(680,310,150,40);
        bb7.setFont(new Font("serif",Font.PLAIN,26));
        bb7.setForeground(Color.WHITE);
        add(bb7);
        
        bb8 = new JLabel("Rs 250000");
        bb8.setBounds(680,380,150,40);
        bb8.setFont(new Font("serif",Font.PLAIN,26));
        bb8.setForeground(Color.WHITE);
        add(bb8);
        
        bb13 = new JLabel("Rs 250000");
        bb13.setBounds(680,450,150,40);
        bb13.setFont(new Font("serif",Font.PLAIN,26));
        bb13.setForeground(Color.WHITE);
        add(bb13);
        
        bb14 = new JLabel("Rs 250000");
        bb14.setBounds(680,520,150,40);
        bb14.setFont(new Font("serif",Font.PLAIN,26));
        bb14.setForeground(Color.WHITE);
        add(bb14);
        
        l5 = new JLabel("Bsc");
        l5.setBounds(880,100,100,40);
        l5.setFont(new Font("serif",Font.BOLD,26));
        l5.setForeground(Color.WHITE);
        add(l5);
        
        bb9 = new JLabel("Rs 180000");
        bb9.setBounds(880,170,150,40);
        bb9.setFont(new Font("serif",Font.PLAIN,26));
        bb9.setForeground(Color.WHITE);
        add(bb9);
        
        bb10 = new JLabel("Rs 180000");
        bb10.setBounds(880,240,150,40);
        bb10.setFont(new Font("serif",Font.PLAIN,26));
        bb10.setForeground(Color.WHITE);
        add(bb10);
        
        bb11 = new JLabel("Rs 180000");
        bb11.setBounds(880,310,150,40);
        bb11.setFont(new Font("serif",Font.PLAIN,26));
        bb11.setForeground(Color.WHITE);
        add(bb11);
        
        bb12 = new JLabel("Rs 180000");
        bb12.setBounds(880,380,150,40);
        bb12.setFont(new Font("serif",Font.PLAIN,26));
        bb12.setForeground(Color.WHITE);
        add(bb12);
        
        bb15 = new JLabel("Rs 180000");
        bb15.setBounds(880,450,150,40);
        bb15.setFont(new Font("serif",Font.PLAIN,26));
        bb15.setForeground(Color.WHITE);
        add(bb15);
        
        bb16 = new JLabel("Rs 180000");
        bb16.setBounds(880,520,150,40);
        bb16.setFont(new Font("serif",Font.PLAIN,26));
        bb16.setForeground(Color.WHITE);
        add(bb16);
        
        l6 = new JLabel("MBA");
        l6.setBounds(1080,100,100,40);
        l6.setFont(new Font("serif",Font.BOLD,26));
        l6.setForeground(Color.WHITE);
        add(l6);
        
        m1 = new JLabel("Rs 650000");
        m1.setBounds(1080,170,150,40);
        m1.setFont(new Font("serif",Font.PLAIN,26));
        m1.setForeground(Color.WHITE);
        add(m1);
        
        m2 = new JLabel("Rs 650000");
        m2.setBounds(1080,240,150,40);
        m2.setFont(new Font("serif",Font.PLAIN,26));
        m2.setForeground(Color.WHITE);
        add(m2);
        
        m3 = new JLabel("Rs 650000");
        m3.setBounds(1080,310,150,40);
        m3.setFont(new Font("serif",Font.PLAIN,26));
        m3.setForeground(Color.WHITE);
        add(m3);
        
        m4 = new JLabel("Rs 650000");
        m4.setBounds(1080,380,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,26));
        m4.setForeground(Color.WHITE);
        add(m4);

        
        l10 = new JLabel("Semester 1");
        l10.setBounds(80,170,150,40);
        l10.setFont(new Font("serif",Font.BOLD,26));
        l10.setForeground(Color.WHITE);
        add(l10);
        
        l11 = new JLabel("Semester 2");
        l11.setBounds(80,240,150,40);
        l11.setFont(new Font("serif",Font.BOLD,26));
        l11.setForeground(Color.WHITE);
        add(l11);
        
        l12 = new JLabel("Semester 3");
        l12.setBounds(80,310,150,40);
        l12.setFont(new Font("serif",Font.BOLD,26));
        l12.setForeground(Color.WHITE);
        add(l12);
        
        l13 = new JLabel("Semester 4");
        l13.setBounds(80,380,150,40);
        l13.setFont(new Font("serif",Font.BOLD,26));
        l13.setForeground(Color.WHITE);
        add(l13);
        
        l14 = new JLabel("Semester 5");
        l14.setBounds(80,450,150,40);
        l14.setFont(new Font("serif",Font.BOLD,26));
        l14.setForeground(Color.WHITE);
        add(l14);
        
        l15 = new JLabel("Semester 6");
        l15.setBounds(80,520,150,40);
        l15.setFont(new Font("serif",Font.BOLD,26));
        l15.setForeground(Color.WHITE);
        add(l15);
        
        l16 = new JLabel("Semester 7");
        l16.setBounds(80,590,150,40);
        l16.setFont(new Font("serif",Font.BOLD,26));
        l16.setForeground(Color.WHITE);
        add(l16);
        
        l17 = new JLabel("Semester 8");
        l17.setBounds(80,660,150,40);
        l17.setFont(new Font("serif",Font.BOLD,26));
        l17.setForeground(Color.WHITE);
        add(l17);

        
        getContentPane().setBackground(new Color(170, 41, 80));
        setVisible(true);
    }
    
    public static void main(String[] args){
        new FeeStructure().setVisible(true);
    }
}
