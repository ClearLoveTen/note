package JUC.线程八锁;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/7 12:52
 */
public class Ipone5 {


    public static synchronized void sendEmail() throws Exception {

        TimeUnit.SECONDS.sleep(2);
        System.out.println("发邮件");
    }

    public static synchronized void sendSMS() {

        System.out.println("发短信");
    }

    public  void sayHello() {

        System.out.println("sayHello");
    }


    public static void main(String[] args) throws Exception{


         Ipone5 ipone = new Ipone5();
         Ipone5 ipone1 = new Ipone5();

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
                ipone1.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }









}
