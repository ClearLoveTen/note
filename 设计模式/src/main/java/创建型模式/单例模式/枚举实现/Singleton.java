package 创建型模式.单例模式.枚举实现;

/**
 * @author xiaotiaowa
 * @version 1.0 枚举法 可以规避反序列化   反射 延迟加载 完美无缺
 * @date 2019/9/23 12:22
 */
public enum Singleton {

    SINGLETON;

   private Singleton() {
       System.out.println("laiel ");

    }
    public static Singleton getSingleton(){

        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return SINGLETON;
    }

    public static void main(String[] args) {

        for (int i=0;i<100;i++){
            new Thread(() ->Singleton.getSingleton()).start();

        }
    }
}
