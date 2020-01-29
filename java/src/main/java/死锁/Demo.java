package 死锁;

import org.omg.SendingContext.RunTime;
import sun.rmi.runtime.RuntimeUtil;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/29 12:57
 */
public class Demo {


    /**
     * 资源类
     */
    static class Resources {

        private String A;
        private String B;

        public Resources(String a, String b) {
            A = a;
            B = b;
        }

        public void runA() {

            synchronized (A) {
                System.out.println(Thread.currentThread().getName() + "现在持有" + A);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("正在获取B------" + B);
                synchronized (B) {

                }
            }

        }

        public void runB() {


            synchronized (B) {
                System.out.println(Thread.currentThread().getName() + "现在持有" + B);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println("正在获取A------" + A);
                synchronized (A) {

                }


            }

        }


    }
    /* 死锁是指两个或者两个以上的进程在执行过程中，因抢夺资源而造成的一种互相等待的现象，
     * 若无外力干涉它们将都无法推进下去，如果系统资源充足，进程的资源请求都能够得到满足，
     * 死锁出现的可能性也就很低，否则就会因争夺有限的资源而陷入死锁。]
     * jps -l 查看死锁的类
     * jstack - 线程号 查看死锁信心
     *
     * */

    public static void main(String[] args) {

        Resources resources = new Resources("A", "B");

        new Thread(() -> resources.runA(), "第一个线程").start();
        new Thread(() -> resources.runB(), "第二个线程").start();


    }

}

