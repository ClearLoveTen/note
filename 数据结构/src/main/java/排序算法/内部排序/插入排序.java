package 排序算法.内部排序;


import java.util.Arrays;

/**
 * 插入排序 时间复杂度
 * <p>
 * 前两种有点相比(冒泡排序，选择排序)   快
 * <p>
 * 每次取出一个数，在前边取出的数中找到合适的位置插入进去
 * 进行 i 轮
 */
public class 插入排序 {

    public static void main(String[] args) {

        int size = 100000; //100000 8520
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {

            a[i] = (int) (Math.random() * size);
        }
      System.out.println(Arrays.toString(a));

        long l = System.currentTimeMillis();

        for (int i = 1; i < a.length; i++) {
            int t = i;
            int num = a[t];
            while (t > 0 && a[t - 1] > num) {
                a[t] = a[t - 1];
                --t;
            }
            a[t] = num;

        }


        System.out.println(System.currentTimeMillis() - l);
        //    System.out.println(Arrays.toString(a));


    }
}