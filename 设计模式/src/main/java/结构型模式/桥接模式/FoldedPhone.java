package 结构型模式.桥接模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 12:31
 */
public class FoldedPhone extends phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void close() {
        System.out.println("折叠手机");

        super.close();
    }

    @Override
    protected void open() {
        System.out.println("折叠手机");

        super.open();
    }

    @Override
    protected void call() {
        System.out.println("折叠手机");

        super.call();
    }
}
