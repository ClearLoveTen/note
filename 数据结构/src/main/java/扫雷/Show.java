package 扫雷;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/2 11:02
 */
public class Show extends JFrame implements ActionListener {

    JButton a1,a2,a3;
    JLabel   t;
    public Show()
    {
        super("扫雷");

        Container C=this.getContentPane();

        C.setLayout(new GridLayout(2, 2));

        setSize(500, 550);
        setLocation(600,200);
        t =new  JLabel("请选择游戏难度", 0);
        a1 =new JButton("简单");
        a2 =new JButton("一般");
        a3 =new JButton("困难");
        C.add(t);
        C.add(a1);
        C.add(a2);
        C.add(a3);
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //设置关闭方式 如果不设置的话 似乎关闭窗口之后不会退出程序

        setVisible(true);

    }


    public static void main(String[] args) {

        new Show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        dispose();
        if(e.getActionCommand().equals("简单"))
            new Game(9,9,10);
        else
        if(e.getActionCommand().equals("一般"))
            new Game(16,16,40);
        else
        if(e.getActionCommand().equals("困难"))
            new Game(30,16,99);

    }
}
