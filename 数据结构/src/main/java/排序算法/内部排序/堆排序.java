package 排序算法.内部排序;

import java.util.Arrays;

/**
 * @author xiaotiaowa
 * @version 1.0              堆排序思想理解，
 *                            1、先把数组构建成一个大顶堆
 *                            2、然后把堆顶元素 和数组最后一个元素交换
 *                            3、循环 构建，
 * @date 2019/9/23 13:11
 */
public class 堆排序 {

    public static void main(String[] args) {
        int size=2002;
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {

            num[i] = (int) (Math.random() * size);
        }
        堆排序.sort(num,false);


        System.out.println(Arrays.toString(num));
    }



    /**
     * 堆排序
     * @param data    要排序的数组
     * @param reverse 从大到小(false)还是从小到大(ture)
     */
    public static void sort(int[] data, boolean reverse) {
        if (data.length == 1) {
            return;
        }
        for (int i = 0; i < data.length; i++) {
            //建堆
            buildHeap(data, 0, data.length -1 - i, reverse);
            int tmp = data[0];
            data[0] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }
    }

    /**
     * 将指定开始和结束段的数据建堆
     * @param data
     * @param beginIndex
     * @param endIndex
     * @param reverse
     */
    public static void buildHeap(int[] data, int beginIndex, int endIndex, boolean reverse) {
        if (beginIndex >= endIndex) {
            return;
        }
        for (int i = (endIndex + beginIndex - 1) / 2; i >= beginIndex; i--) {
            int cur = i;
            if (reverse) {   //大顶堆,用来从小到大排序
                //发生交换之后需要检查孙子节点,重孙子节点...
                while (2 * cur + 1 <= endIndex) {
                    int biggerChildIndex = 2 * cur + 1;
                    if (biggerChildIndex + 1 <= endIndex) {
                        if (data[biggerChildIndex] < data[biggerChildIndex + 1]) {
                            biggerChildIndex = biggerChildIndex + 1;
                        }
                    }
                    //找到最大子节点,如果比当前节点大,就交换
                    if (data[i] < data[biggerChildIndex]) {
                        int tmp = data[i];
                        data[i] = data[biggerChildIndex];
                        data[biggerChildIndex] = tmp;
                        //准备检查孙子节点
                        cur = biggerChildIndex;
                    } else {
                        break;
                    }
                }
            } else {    //小顶堆,用来从大到小排序
                //发生交换之后需要检查孙子节点,重孙子节点...
                while (2 * cur + 1 <= endIndex) {
                    int samllerChildIndex = 2 * i + 1;
                    if (samllerChildIndex + 1 <= endIndex) {
                        if (data[samllerChildIndex] > data[samllerChildIndex + 1]) {
                            samllerChildIndex = samllerChildIndex + 1;
                        }
                    }
                    //找到最小子节点,如果比当前节点小,就交换
                    if (data[i] > data[samllerChildIndex]) {
                        int tmp = data[i];
                        data[i] = data[samllerChildIndex];
                        data[samllerChildIndex] = tmp;
                        cur = samllerChildIndex;
                    } else {
                        break;
                    }
                }
            }
        }
    }

}
