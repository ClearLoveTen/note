package 扫雷;

import cn.hutool.log.Log;
import 扫雷.button.MineButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.Year;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/2 11:39
 */
public class Game extends JFrame implements MouseListener {


    int width, high, c;
    public JButton[][] mine;
    service service;

    public Game(int width, int high, int number) throws HeadlessException {

        this.width = width;
        this.high = high;
        Container C = this.getContentPane();
        C.setLayout(new GridLayout(high, high));
        setSize(45 * width, 45 * high);
//        A.setLocation(500, 0);

        setLocationRelativeTo(null);
        mine = new JButton[width][high];
        for (int i = 0; i < width; i++)
            for (int j = 0; j < high; j++) {
                mine[i][j] = new JButton();
                C.add(mine[i][j]);
                mine[i][j].addMouseListener(this);
            }
        service = new service(width, high, number);

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            for (int i = 0; i < width; i++)
                for (int j = 0; j < high; j++)
                    if (e.getSource() == mine[i][j]) {
                        click(i, j);

                    }

        } else if (e.getButton() == MouseEvent.BUTTON3) {
            for (int i = 0; i < width; i++)
                for (int j = 0; j < high; j++) {
                    if (e.getSource() == mine[i][j]) {

                        setIcon("C:\\Users\\111\\Desktop\\代码\\note\\数据结构\\src\\main\\resources\\q100.jpg", mine[i][j]);

                    }
                }
        }

    }


    private void click(int i, int j) {
        int sum = service.click(i, j);
        if (sum == 0) {
            mine[i][j].setEnabled(false);

            //正上方判断
            if (i - 1 != -1 && mine[i][j].isEnabled()) {
                click(i - 1, j);
            }
            //上左判断
            if (i - 1 != -1 &&j - 1 != -1 && mine[i-1][j-1].isEnabled()) {
                click(i - 1, j-1);
            }
            //上右判断
            if (i - 1 != -1 &&j+1!=width&& mine[i-1][j+1].isEnabled()) {
                click(i - 1, j+1);
            }

            //正下方判断
            if (i + 1 != high&& mine[i+1][j].isEnabled()) {
                click(i + 1, j);
            }
            //下左
            if (i+1!=high&&j - 1 != -1&& mine[i+1][j-1].isEnabled()) {
                click(i + 1, j - 1);
            }
            //下右
            if (i+1!=width&&j + 1 != width&& mine[i+1][j+1].isEnabled()) {
                click(i + 1, j + 1);
            }

            //左边
            if (j - 1 != -1&& mine[i][j-1].isEnabled()) {
                click(i, j - 1);
            }
            //右边
            if (j + 1 != width&& mine[i][j+1].isEnabled()) {
                click(i, j + 1);
            }


        } else if (sum == -1) {
            System.out.println("爆炸");
            ImageIcon ii = new ImageIcon("images/xxx.png");
            mine[i][j].setIcon(ii);
        } else {
            Font f = new Font("宋体", Font.BOLD, 16);//根据指定字体名称、样式和磅值大小，创建一个新 Font。
            mine[i][j].setText(sum + "");
            mine[i][j].setFont(f);
            mine[i][j].setEnabled(false);

        }
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void setIcon(String file, JButton iconButton) {
        ImageIcon icon = new ImageIcon(file);
        Image temp = icon.getImage().getScaledInstance(iconButton.getWidth(),
                iconButton.getHeight(), icon.getImage().SCALE_DEFAULT);
        icon = new ImageIcon(temp);
        iconButton.setIcon(icon);
    }
}
