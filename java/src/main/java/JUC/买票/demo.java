package JUC.买票;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/6 15:15
 */
public class demo {

    Lock lock1 = new ReentrantLock();

    private int a;

    public demo(int a) {
        this.a = a;
    }

    //买票
    public void a() {
        lock1.lock();

        try {
            if (a>0)
            System.out.println("第" + Thread.currentThread().getName() + "个线程,第" + a-- + "张票，剩余" + a + "张");

        } finally {
            lock1.unlock();
        }


    }

    public static void main(String[] args) {
        final demo demo = new demo(100);

        
        new Thread(() -> { for (int i=0;i<100;i++) demo.a(); },"A").start();
        new Thread(() -> { for (int i=0;i<100;i++) demo.a(); },"B").start();
        new Thread(() -> { for (int i=0;i<100;i++) demo.a(); },"C").start();
        new Thread(() -> { for (int i=0;i<100;i++) demo.a(); },"D").start();


    }


}
