package 结构型模式.适配器模式;

import 设计模式.结构型模式.适配器模式.对象适配器.Voltage220V;
import 设计模式.结构型模式.适配器模式.类适配器模式.VoltageAdapter;
import 设计模式.结构型模式.适配器模式.类适配器模式.phone;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/27 11:50
 */
public class Client {

    /**
     * 类适配器
     * @param args
     */
    public static void main(String[] args) {

        //使用类适配器
        phone phone = new phone();
        //传入适配器类
        phone.charging(new VoltageAdapter());

        System.out.println("-----------------------");

        /**
         * 对象适配器
         */

        设计模式.结构型模式.适配器模式.对象适配器.phone phone1 = new 设计模式.结构型模式.适配器模式.对象适配器.phone();
        phone1.charging(new 设计模式.结构型模式.适配器模式.对象适配器.VoltageAdapter(new Voltage220V()));

    }
}
