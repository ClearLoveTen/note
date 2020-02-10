package JUC.Thrend;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/9 11:57
 */
public class ThreadDemo {
    public static void main(String[] args) throws Exception {

        //Thread类常用方法
        Thread.sleep(1000);//线程睡眠，模仿阻塞，网络延迟，并不会释放锁。
        /*
        1）yield, sleep 都能暂停当前线程，sleep 可以指定具体休眠的时间，而 yield 则依赖 CPU 的时间片划分。
        2）yield, sleep 两个在暂停过程中，如已经持有锁，则都不会释放锁资源。
        3）yield 不能被中断，而 sleep 则可以接受中断。*/
        Thread.yield();

    /*
    1）A线程中调用B线程的join方法，那么A线程需要等待B线程执行完成后才能完成
        2）主线程中依次调用A线程的join方法，B线程的join方法，可以保证A，B线程顺序执行*/
        Thread.currentThread().join();

        //设置线程的优先级  1-10     MIN_PRIORITY最低优先级1;NORM_PRIORITY普通优先级5;MAX_PRIORITY最高优先级10
        Thread.currentThread().setPriority(1);







    }
}
