package 结构型模式.适配器模式.对象适配器;


/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/27 14:34
 */
public class phone {

    public void charging(Voltage5V voltage5V){


        System.out.println("输入电压为"+voltage5V.output5V());

    }
}
