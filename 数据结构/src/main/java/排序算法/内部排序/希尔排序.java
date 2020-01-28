package 排序算法.内部排序;


import java.util.Arrays;

/**
 * 也是插入排序的一种，在插入排序中进行了优化
 * 减小缩进量排序
 */
public class 希尔排序 {
    public static void main(String[] args) {
/*
        int size = 10000;
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {

            a[i] = (int) (Math.random() * size);
        }*/

        int[] a = {8, 9, 45, 63, 1, 87, 6, 3, 95, 2};

        希尔排序.shell(a);
    }
    public static void shell(int[] a) {

        int num;
        //最外圈  总共进行几轮
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            //每一轮进行 几次排序 排序
            for (int j = gap; j < a.length; j++) {
                //每次应该怎样排

                for (int i=gap;i<a.length;i+=gap){
                    int k=i;
                    //插入排序
                    if(a[i-gap]>a[i]){

                        num=a[i];
                        a[i]=a[i-gap];
                        a[i-gap]=num;

                    }

                }
        }
            System.out.println("每轮结束数组的 值"+Arrays.toString(a));
                ;

        }


    }

}
