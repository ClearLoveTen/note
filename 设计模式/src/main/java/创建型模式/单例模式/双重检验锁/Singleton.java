package 创建型模式.单例模式.双重检验锁;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/23 12:18
 */
public class Singleton {

    private static volatile Singleton singleton=null;

    private Singleton() {


    }

    public  static Singleton getSingleton() {

        if (singleton==null){
                synchronized (singleton){

                    if (singleton==null){

                        singleton=new Singleton();
                    }


                }
        }


        return singleton;
    }
}

