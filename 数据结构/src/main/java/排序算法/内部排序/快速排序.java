package 排序算法.内部排序;

import java.util.Arrays;

/**
 * @author xiaotiaowa
 *  手撕快速排序
 * @version 1.0
 * @date 2019/9/19 21:15
 */
public class 快速排序 {


    public static void main(String[] args) {
        int size=20;
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {

            num[i] = (int) (Math.random() * size);
        }
        System.out.println(Arrays.toString(num));
        快速排序 快速排序 = new 快速排序();
        快速排序.quickSort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }


    public static int[] quickSort(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) arr=quickSort(arr,start,i-1);
        if (j+1<end) arr=quickSort(arr,j+1,end);
        return (arr);
    }



}
