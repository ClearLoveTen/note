package JUC.依次打印ABC线程;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/20 23:18
 */
public class LockDemo {

    //加标志位实行伦次打印
    int i = 1;
    Lock lock = new ReentrantLock();

    Condition conditionA = lock.newCondition();


    Condition conditionB = lock.newCondition();

    Condition conditionC = lock.newCondition();


    //A线程
    public void printA(int total) throws InterruptedException {
        lock.lock();

        try {
            if (i != 1) {
                conditionA.await();

            }

            System.out.println(Thread.currentThread().getName() + "号线程打印第"+total+"次");
            i = 2;
            conditionB.signal();
        } finally {
            lock.unlock();
        }


    }

    //B线程
    public void printB(int total) throws InterruptedException {
        lock.lock();

        try {
            if (i != 2) {
                conditionB.await();

            }

            System.out.println(Thread.currentThread().getName() + "号线程打印第"+total+"次");


            i = 3;
            conditionC.signal();

        } finally {
            lock.unlock();
        }


    }    //A线程

    public void printC(int total) throws InterruptedException {
        lock.lock();

        try {
            if (i != 3) {
                conditionC.await();

            }

            System.out.println(Thread.currentThread().getName() + "号线程打印第"+total+"次");
            i = 1;
            conditionA.signal();


        } finally {
            lock.unlock();
        }


    }


    public static void main(String[] args) {


        LockDemo lockDemo = new LockDemo();


        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {

                    lockDemo.printA(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {

                    lockDemo.printB(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    lockDemo.printC(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"C").start();

    }


}
