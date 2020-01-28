package 排序算法.内部排序;

public class 冒泡排序 {

    /*
        时间复杂度是 2^n次方
     *  可以优化，如果在一次循环中，没有交换一次，则说明顺序已经排好，可以结束排序
     *  测试发现，作用不大。
     *
     *  和选择排序相比 优点  节省内存空间 稳定，缺点慢 效率低
     *
     *
     * */
    public static void main(String[] args) {

        int size=10000;
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {

            a[i] = (int) (Math.random() * size);
        }



        long l = System.currentTimeMillis();
        for (int i = 0; i < a.length - 1; i++) {

            //优化  判断一轮中是否发生交换
            boolean change =false;
            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];

                    change=true;
                }
            }
            if (!change){
                System.out.println("没有改变");

                break;
            }


        }


        long l2 = System.currentTimeMillis();
        System.out.printf("程序运行时间为 %d",l2-l);
/*        System.out.println();
        for (int t = 0; t < a.length; t++) {

            System.out.printf(" %d ", a[t]);

        }*/

    }


}
