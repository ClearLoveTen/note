package 结构型模式.桥接模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 12:23
 */


//样式抽象类
public abstract class phone {
    private Brand brand;

    public phone(Brand brand) {
        this.brand = brand;
    }


    protected void close(){

        this.brand.close();
    }

    protected void open(){
        this.brand.open();
    }
    protected void call(){
        this.brand.call();
    }
}
