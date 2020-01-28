package 创建型模式.单例模式.同步代码块;

/**
 * @author xiaotiaowa  加Synchromized关键字
 * @version 1.0
 * @date 2019/9/23 12:12
 */
public class Singleton {
    private  static  Singleton singleton=null;

    private Singleton() {
        System.out.println("我来了");
    }


    public  static synchronized Singleton getSingleton() {

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
