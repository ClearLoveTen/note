package JUC.原子变量;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/20 18:03
 */
public class CAS implements Runnable{

    AtomicInteger atomicInteger= new AtomicInteger();
    @Override
    public void run() {

        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+"  " +getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getI() {
        return  atomicInteger.getAndIncrement();
    }

    public static void main(String[] args) {

        CAS demo = new CAS();
        for (int i=0;i<10;i++) {
            new Thread(demo).start();
            new Thread(demo).start();
            new Thread(demo).start();
            new Thread(demo).start();
            new Thread(demo).start();
            new Thread(demo).start();
            new Thread(demo).start();
            new Thread(demo).start();

        }

    }
}
