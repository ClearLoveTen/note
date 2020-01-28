package 结构型模式.桥接模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 12:32
 */
public class UpRightPhone extends phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void close() {
        System.out.println("直立样式");
        super.close();
    }

    @Override
    protected void open() {
        System.out.println("直立样式");

        super.open();
    }

    @Override
    protected void call() {
        System.out.println("直立样式");

        super.call();
    }
}
