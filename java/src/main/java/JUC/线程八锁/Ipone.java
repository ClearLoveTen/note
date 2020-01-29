package JUC.线程八锁;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/7 12:52
 */
public class Ipone {


    public synchronized void sendEmail() throws Exception {
        TimeUnit.SECONDS.sleep(3);

        System.out.println("发邮件");
    }

    public synchronized void sendSMS() {

        System.out.println("发短信");
    }
    public static void main(String[] args) throws Exception{


         Ipone ipone = new Ipone();

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
