package 线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/29 14:34
 */
public class demo {

    /**
     * 核心 TheadPool
     * @param args
     */
    public static void main(String[] args) {


        /**
         * 设置数量一定的线程池 new
         */
        Executor executor2= Executors.newFixedThreadPool(5);
        /**
         *设置一个线程的线程池 new 核心线程1  最大线程1
         */
        Executor executor= Executors.newSingleThreadExecutor();
        /**
         * 设置可变长度的线程池  核心长度0 最大长度 integer.max
         */
        Executor executor1= Executors.newCachedThreadPool();

        executor2.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("来了来了");
            }
        });


    }
}
