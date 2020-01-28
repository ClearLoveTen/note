package 排序算法.内部排序;

/*
 *
 *
 *
 * 总共进行 i 轮  每次循环 找出最小的的数字，和第一个交换
 *
 * 优点稳定  缺点 次数多 慢
 *
 *
 *
 *
 * */

public class 选择排序 {


    public static void main(String[] args) {

        int size=10000;
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {

            a[i] = (int) (Math.random() * size);
        }


        long l = System.currentTimeMillis();


        for (int i = 0; i < a.length - 1; i++) {
            int t = 0;

            for (int j = i; j < a.length - 1; j++) {

                if (a[j] < a[j + 1]) {

                    t = j;
                }

                a[i] = a[t];

            }


        }
        long l2 = System.currentTimeMillis();
        System.out.printf("程序运行时间为 %d", l2 - l);
 /*       System.out.println();
        for (int t = 0; t < a.length; t++) {

            System.out.printf(" %d ", a[t]);

        }*/

    }

}

