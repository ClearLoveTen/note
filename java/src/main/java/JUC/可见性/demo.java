package JUC.可见性;


import JVM.DeMo;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/7 20:56
 */
public class demo {
    //改变可见性，加入通知volatile
   public volatile int i=0;

    public void update() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);

      i=1314;

    }

    public static void main(String[] args) throws InterruptedException {

        demo deMo = new demo();
        new Thread(() -> {
            try {
                deMo.update();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        TimeUnit.SECONDS.sleep(1)
        ;
        while (deMo.i==0){



        }
    }


}
