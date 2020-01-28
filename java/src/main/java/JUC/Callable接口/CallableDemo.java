package JUC.Callable接口;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author xiaotiaowa  1.8 后出现 callable接口
 * @version 1.0        有返回值，默认有一样抛出
 * @date 2019/10/7 14:28 FutureTask 实现了 imlements
 */
public class CallableDemo implements Callable<String> {


    @Override
    public String call() throws Exception {
        System.out.println("武佳豪呀");

        return "wujiahao";
    }

    public static void main(String[] args)throws  Exception {


        FutureTask futureTask=new FutureTask(new CallableDemo());
        new Thread(futureTask).start();

        System.out.println(futureTask.get());


    }
}
