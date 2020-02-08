package 创建型模式.单例模式.懒汉模式;

/**
 * @author xiaotiaowa  网络延迟下 可能出现线程不安全
 * @version 1.0
 * @date 2019/9/23 12:05
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        System.out.println("进来了");
    }


    public static Singleton getSingleton() {

            if (singleton==null){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                singleton=new Singleton();
            }
            return singleton;

    }

    public static void main(String[] args) {

        for (int i=0;i<100;i++){
        new Thread(() -> Singleton.getSingleton()).start();

    }
    }


}
