package 集合.Queue;

import java.util.*;

/**
 * @author xiaotiaowa       当第一个元素出列之后，对剩下的元素进行再排序，挑选出最小的元素排在数组第一个位置。
 * @version 1.0             底层是堆
 * @date 2019/9/15 9:47
 */
public class PirorityDemo {


    public static void main(String[] args) {


        PriorityQueue<Integer> as = new PriorityQueue<>();

        as.add(6);

        as.add(2);
        as.add(2);
        as.add(6);
        as.add(5);
        as.add(1);
        as.add(1);
        as.add(6);
        as.add(7);
        as.add(6);

        while (!as.isEmpty()) {
            System.out.println(as.poll());
        }

    }
}
