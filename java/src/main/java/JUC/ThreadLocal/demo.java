package JUC.ThreadLocal;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/20 11:00
 */
public class demo {

   static ThreadLocal<String> threadLocal=new ThreadLocal<>();
    public static void main(String[] args) {

        test();
    }

    public static void test (){

        new Thread(() -> {
            threadLocal.set("武佳豪");
            System.out.println(Thread.currentThread().getName()+threadLocal.get());

        },"第一个").start();

        new Thread(() -> {

            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+threadLocal.get());
            threadLocal.set("李小青");

            System.out.println(Thread.currentThread().getName()+threadLocal.get());



        },"第二个").start();

    }
}
