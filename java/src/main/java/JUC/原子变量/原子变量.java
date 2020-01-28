package JUC.原子变量;

/**
 * @author xiaotiaowa
 * @version 1.0     不成功例子
 * @date 2019/9/20 17:49
 */
public class 原子变量 implements Runnable{

    //加 volatile关键字不起作用
  volatile   int  i=0;

    @Override
    public  void run() {
        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+"  " +getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public  int getI() {
        return i++;
    }


    public static void main(String[] args) {

        原子变量 原子变量 = new 原子变量();
        for (int j=0;j<10;j++) {
            new Thread(原子变量).start();

        }

    }
}
