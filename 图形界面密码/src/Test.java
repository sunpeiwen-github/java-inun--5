import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
/*
*用户名是Linda
* 密码123456
* */

class Jm implements ActionListener
{
    JFrame jf;
    JLabel l1,l2,l3;
    JPasswordField pass1;
    JTextField t1;
    JButton b1,b2;
    JPanel p1,p2,p3;
    int num=0;
    Jm()
    {
        jf=new JFrame("登陆界面");
        l1=new JLabel("用户名");
        l2=new JLabel("密码");
        l3=new JLabel("");
        pass1=new JPasswordField(20);
        t1=new JTextField(20);
        b1=new JButton("确定");
        b2=new JButton("重置");
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        BorderLayout bl= new BorderLayout();
        jf.setSize(280,150);
        jf.setLayout(bl);
      /*  jf.add(bl.EAST,l1);jf.add(t1);
        jf.add(l2);jf.add(pass1);
        jf.add(l3);
        */
        p1.add(l1);p1.add(t1);
        p2.add(l2);p2.add(pass1);
        p3.setLayout(new GridLayout(2,2));
        p3.add(b1);p3.add(b2);p3.add(l3);
        jf.add(bl.NORTH,p1);
        jf.add(bl.CENTER,p2);
        jf.add(bl.SOUTH,p3);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(num>3)
        {
            t1.setText("");
            pass1.setText("");
            l3.setText("输入超过3次");
        }
        else {
            if (e.getSource() == b1) {
                num++;
                if (t1.getText().equals("Linda") && pass1.getText().equals("123456"))//?
                {
                    l3.setText("登陆成功");
                } else {
                    l3.setText("登陆失败");
                }
            } else {
                t1.setText("");
                pass1.setText("");
            }
        }
    }
}
public class Test {
    public static void main(String []args)
    {
        Jm jm=new Jm();
    }
}
