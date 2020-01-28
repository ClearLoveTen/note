package JUC;

/**
 * @author xiaotiaowa    Volatile 解决内存不可见
 * @version 1.0
 * @date 2019/9/20 17:17
 */
public class VolatileDemo implements  Runnable{

    private static volatile boolean  bo =false;
    @Override
    public void run() {

        while (true){

            if (bo==false){

                bo=true;
                System.out.println("改成true了");
            }

        }
    }

    public static void main(String[] args) {
        new Thread(new VolatileDemo()).start();

        while (true){

            if (bo==true){

                System.out.println("改成false了");
                bo=false;

            }




        }



    }
}
