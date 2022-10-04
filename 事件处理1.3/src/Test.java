import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Mb {
    JFrame jf;
    JButton buttonOK, buttonCancel;

    Mb() {
        jf = new JFrame();
        jf.setSize(300, 100);
        jf.setTitle("窗口");
        buttonOK = new JButton("确定");
        buttonCancel = new JButton("取消");
        jf.setLayout(new FlowLayout());
        jf.add(buttonOK);
        jf.add(buttonCancel);
        jf.setVisible(true);
        Change change = new Change();
        buttonOK.addActionListener(change);
        buttonCancel.addActionListener(change);
        jf.setDefaultCloseOperation(3);
    }

    class Change implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonOK) {
                jf.setTitle("你单击了确定按钮");
                buttonOK.setText("OK");
            } else {
                jf.setTitle("你单击了取消按钮");
                buttonCancel.setText("Cancel");
            }
        }
    }
}
public class Test {
    public static void main(String []args){
        Mb mb=new Mb();
    }
}