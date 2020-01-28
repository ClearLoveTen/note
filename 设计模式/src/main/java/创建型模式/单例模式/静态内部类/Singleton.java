package 创建型模式.单例模式.静态内部类;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/23 12:28
 */
public class Singleton {

    private Singleton singleton=null;

    private Singleton() {

    }

    private  static class SingletonS{
        private static Singleton  singleton=new Singleton();
    }

    public Singleton getSingleton() {
        return singleton;
    }
}
