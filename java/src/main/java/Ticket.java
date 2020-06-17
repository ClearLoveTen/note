import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Ticket implements Callable {
    private int ticket = 1000;
    @Override
    public Object call() throws Exception {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {

                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } else {
                    return null;
                }
            }
        }
    }
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(new FutureTask<Object>(ticket),"窗后1").start();
        new Thread(new FutureTask<Object>(ticket),"窗后2").start();



    }
}