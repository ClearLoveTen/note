package 创建型模式.单例模式.饿汉模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/23 11:58
 */
public class Singleton {

    private static final Singleton singleton=new Singleton();

    private Singleton() {
    }


    public static Singleton getSingleton() {
        return singleton;
    }


    public static void main(String[] args) {
        Singleton.getSingleton();
    }
}
