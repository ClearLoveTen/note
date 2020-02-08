package 结构型模式.适配器模式.类适配器模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/27 14:06
 */

/**
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int outPut5V() {
        return this.outPut() / 44;
    }
}
