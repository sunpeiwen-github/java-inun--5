import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Jm implements ActionListener
{
    JFrame jf;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton sum;
    Jm()
    {
        jf=new JFrame("求和界面");
        l1=new JLabel("数学");
        l2=new JLabel("语文");
        l3=new JLabel("总分");
        t1=new JTextField(15);
        t2=new JTextField(15);
        t3=new JTextField(15);
        sum=new JButton("求和");
        jf.setLayout(new FlowLayout());
        jf.setSize(200,300);
        jf.add(l1);  jf.add(t1);
        jf.add(l2);  jf.add(t2);
        jf.add(l3);  jf.add(t3);
        jf.add(sum);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
        sum.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int math=Integer.parseInt(t1.getText());
        int china=Integer.parseInt(t2.getText());
        int sum1=math+china;
        t3.setText(Integer.toString(sum1));
    }
}
public class Test {
    public static void main(String[]args)
    {
        Jm jm=new Jm();
    }
}
