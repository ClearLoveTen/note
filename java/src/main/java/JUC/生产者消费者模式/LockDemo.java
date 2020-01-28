package JUC.生产者消费者模式;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaotiaowa
 * @version 1.0      多线程交互不能用 if（）判断  必须加while
 * @date 2019/9/20 22:56
 */
public class LockDemo {


    Lock lock=new ReentrantLock();

    Condition condition = lock.newCondition();


    //资源数量
    int num;

    public LockDemo(int num) {
        this.num = num;
    }

    /**
     * 生产者
     */
    public  void producer() throws InterruptedException {

        lock.lock();
        try {
            while (num > 10) {
                condition.await();

            }


            System.out.println(Thread.currentThread().getName()+" 生产了 "+(++num)+"资源");
            condition.signal();
        }finally {
            lock.unlock();
        }



    }

    /**
     * 消费者
     */
    public  void customer() throws InterruptedException {

        lock.lock();
        try {
            while (num < 1) {
                condition.await();

            }

            System.out.println(Thread.currentThread().getName()+" 消费第 "+(num--)+"资源");
            condition.signal();
        }finally {
            lock.unlock();
        }


    }

    public static void main(String[] args) {
        LockDemo LockDemo = new LockDemo(0);


        new Thread(() -> {

            for (int i = 0; i < 20; i++) {
                try {
                    LockDemo.customer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"消费者1号").start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    LockDemo.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"生产者1号").start();


    }







}
