package 结构型模式.桥接模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 12:20
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机打开了");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话了");

    }

    @Override
    public void close() {
        System.out.println("小米手机关闭了了");

    }
}
