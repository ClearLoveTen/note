package JUC.线程八锁;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/7 12:52
 */
public class Ipone2 {


    public synchronized void sendEmail() throws Exception {

        TimeUnit.SECONDS.sleep(2);
        System.out.println("发邮件");
    }

    public synchronized void sendSMS() {

        System.out.println("发短信");
    }

    public  void sayHello() {

        System.out.println("sayHello");
    }


    public static void main(String[] args) throws Exception{


         Ipone2 ipone = new Ipone2();

        new Thread(() -> {
            try {
                ipone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        TimeUnit.SECONDS.sleep(1);

        new Thread(() -> {
            try {
                ipone.sayHello();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }









}
