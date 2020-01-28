package 算法.二分查找;

/**
 * 二分查找，非递归的实现。
 */

public class BinarySearchNoRecur {


    public static void main(String[] args) {
        int[] a = {2, 6, 8, 12, 13, 14, 15, 19, 20, 24, 26};

        BinarySearchNoRecur binarySearchNoRecur = new BinarySearchNoRecur();
        System.out.println(binarySearchNoRecur.search(a, 6));


    }

    public int search(int[] array, int num) {

        int left = 0;
        int right = array.length - 1;
        int middle;

        while (left <= right) {//一定要加等于号

            middle = (left + right) / 2;

            //需要查找的数等于中间的数
            if (array[middle] == num) {

                return middle;

            }  //需要查找的数小于中间的数
            else if (array[middle] > num) {

                right = middle - 1;


            }  //需要查找的数大于中间的数
            else {

                left = middle + 1;
            }


        }

        throw new RuntimeException("没有找到这个数字");


    }


}
