package 结构型模式.适配器模式.对象适配器;


/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/27 14:18
 */
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }


    //进行适配操作
    @Override
    public int output5V() {


        return voltage220V.outPut()/44;
    }
}
