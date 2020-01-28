package JUC.生产者消费者模式;

/**
 * @author xiaotiaowa  生产者消费者模式 Synchroinized
 * @version 1.0
 * @date 2019/9/20 22:41
 */
public class Synchroinized {

    //资源数量
    int num;

    public Synchroinized(int num) {
        this.num = num;
    }

    /**
     * 生产者
     */
    public synchronized void producer() throws InterruptedException {

        while (num > 10) {

            this.wait();

        }

        num++;
        System.out.println(Thread.currentThread().getName()+" 生产了 "+num+"资源");

        this.notifyAll();
    }

    /**
     * 消费者
     */
    public synchronized void customer() throws InterruptedException {

        while (num < 1) {

            this.wait();

        }

        num--;
        System.out.println(Thread.currentThread().getName()+" 消费第 "+num+"资源");

        this.notifyAll();
    }

    public static void main(String[] args) {
        Synchroinized synchroinized = new Synchroinized(0);


        new Thread(() -> {

            for (int i = 0; i < 20; i++) {
                try {
                    synchroinized.customer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"消费者1号").start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    synchroinized.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"生产者1号").start();


    }


}
