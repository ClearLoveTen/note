package JVM;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/7 18:06
 */
public class DeMo {
    public static void main(String[] args) {

        //加上-XX:+PrintGCDetails这句话。于是，运行程序后，GC日志就可以打印出来了
        byte []s=new byte[1024*1024*1024*1];
        //计算机核数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //理论上最大的内存（字节）
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024+"MB");
        //理论上最小内存
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024+"MB");
       // 1、-Xmx –Xms：指定最大堆和最小堆

    }
}
