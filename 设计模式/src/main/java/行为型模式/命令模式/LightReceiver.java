package 行为型模式.命令模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 22:04
 */
public class LightReceiver {
    public void on() {
        System.out.println("电灯打开了..");
    }

    public void off() {
        System.out.println("电灯关闭了..");
    }
}
