package JUC.线程八锁;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/7 12:52
 */
public class Ipone4 {


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


         Ipone4 ipone = new Ipone4();

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
                ipone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }









}
