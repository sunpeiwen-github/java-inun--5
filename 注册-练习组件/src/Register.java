import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Jm {
    JButton b1, b2;
    JTextField t1, t2;
    JPasswordField p1;
    JLabel l1, l2, l3, l4,l5,l6,l7,l8;
    ButtonGroup bgroup;
    JRadioButton man, woman;
    JCheckBox interest1, interest2, interest3;
    JComboBox age;
    JList major;
    JFrame jf;
    JScrollPane js;
    JTextArea jt;
    String sex,interest0,major0,age0;

    Jm() {
        jf = new JFrame("注册");
        jf.setSize(450, 300);
        l1=new JLabel("姓名");
        l2=new JLabel("学号");
        l3=new JLabel("密码");
        l4=new JLabel("性别");
        l5=new JLabel("兴趣");
        l6=new JLabel("年龄");
        l7=new JLabel("专业");
        l8=new JLabel("");
        p1 = new JPasswordField(10);
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("注册");
        b2 = new JButton("重置");
        man = new JRadioButton("男");
        woman = new JRadioButton("女");
        bgroup = new ButtonGroup();
        bgroup.add(man);
        bgroup.add(woman);
        interest1 = new JCheckBox("读书");
        interest2 = new JCheckBox("游泳");
        interest3 = new JCheckBox("打球");
        jt=new JTextArea();


        String[] num= {"1","2","3","4","5","6"};
        age=new JComboBox(num);
        String[] maj={"控计","电气","经管"};
        major = new JList(maj);
       // major.setSelectionMode(1);
     //   js=new JScrollPane(major);

        jf.setLayout(new FlowLayout());
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(l3);
        jf.add(p1);
        jf.add(l4);
        jf.add(man);
        jf.add(woman);
        jf.add(l5);
        jf.add(interest1);
        jf.add(interest2);
        jf.add(interest3);
        jf.add(l6);
        jf.add(age);
        jf.add(l7);
        jf.add(major);
        jf.add(b1);
        jf.add(b2);
        jf.add(l8);
        jf.add(jt);




        man.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(man.isSelected())
                {
                    sex=new String("男");
                }
            }
        });
        woman.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(woman.isSelected())
                {sex=new String("女");
                     }
            }

        });
        interest1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(interest1.isSelected()) {
                    interest0=new String("读书");
                }}

        });
        interest2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(interest2.isSelected()) {
                    interest0=new String("游泳");
                }}

        });
        interest3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(interest3.isSelected())
                {interest0=new String("打球");

                }}
        });
        age.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                age0=new String((String)age.getSelectedItem());
                }

        });



       major.addListSelectionListener(new ListSelectionListener() {
           @Override
           public void valueChanged(ListSelectionEvent e) {
              major0=new String((String) major.getSelectedValue());
           }
       });
       b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               jt.append("姓名"+t1.getText()+"学号"+t2.getText()+"密码"+p1.getText()+"性别"+sex+"兴趣"+interest0+"年龄"+age0+"专业"+major0+"\r\n");

           }
       });
       b2.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               t1.setText("");
               t2.setText("");
               p1.setText("");
               man.setSelected(false);
               woman.setSelected(false);
               interest1.setSelected(false);
               interest2.setSelected(false);
               interest3.setSelected(false);
           }
       });

        jf.setDefaultCloseOperation(3);
        jf.setVisible(true);
    }
}

public class Register {
    public static void main(String[] args) {

        Jm jm = new Jm();
    }

}
