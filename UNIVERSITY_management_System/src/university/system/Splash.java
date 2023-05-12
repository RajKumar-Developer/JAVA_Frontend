package university.management.system;

import java.awt.*;
import javax.swing.*;
class Frame extends JFrame implements Runnable{
    Thread t1;
    Frame(String s){
        super(s);
        setLayout(new FlowLayout());
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/aa.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1742, 920,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);

        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(50);
            Login f1 = new Login();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class Splash{
    public static void main(String[] s){
        Frame f = new Frame("Amrita University");
        f.setVisible(true);
        f.setSize(1680,1000);
        try{
            Thread.sleep(100);
        }catch(Exception ignored) { }
    }
}
