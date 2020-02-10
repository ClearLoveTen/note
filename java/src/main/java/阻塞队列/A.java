package 阻塞队列;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/28 19:23
 */
public class A {
    public static void main(String[] args) {

        /**
         *
         * LinkedBlockingQueue:由链表结构组成的有界（但大小默认值为Integer.MAX_VALUE）阻塞队列。
         * PriorityBlockingQueue:支持优先级排序的无界阻塞队列。
         * DelayQueue:使用优先级队列实现的延迟无界阻塞队列。
         * ArrayBlockingQueue:由数组结构组成的有界阻塞队列
         * SynchronousQueue:不存储元素的阻塞队列，也即单个元素的队列。
         *      SynchronousQueue没有容量。
         *      与其他BlockingQueue不同，SynchronousQueue是一个不存储元素的BlockingQueue。
         *      每一个put操作必须要等待一个take操作，否则不能继续添加元素，反之亦然。
         * LinkedTransferQueue：由链表结构组成的无界阻塞队列。
         * LinkedBlockingDeque：由链表结构组成的双向阻塞队列。
         */


        BlockingQueue blockingQueue=new SynchronousQueue<>();

    }

}
