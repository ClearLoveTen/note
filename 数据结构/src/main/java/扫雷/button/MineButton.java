package 扫雷.button;

import javax.swing.*;
import java.awt.*;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/2 12:05
 */
public class MineButton   {
    private static JButton   button=null;
    private MineButton (){

         button = new JButton ();
        ImageIcon ii = new ImageIcon("images/xxx.png");
        button.setIcon(ii);

    }
    public synchronized static JButton getJButton(){

        if (button==null){

         new MineButton();
        }

        return button;


    }
}
