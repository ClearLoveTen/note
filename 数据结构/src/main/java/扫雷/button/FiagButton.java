package 扫雷.button;

import javax.swing.*;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/2 12:15
 */
public class FiagButton  {
    private static JButton button=null;
    private FiagButton (){

        button = new JButton ();
        ImageIcon ii = new ImageIcon("");
        button.setIcon(ii);

    }
    public synchronized static JButton getJButton(){

        if (button==null){

            new FiagButton();
        }

        return button;


    }
}
