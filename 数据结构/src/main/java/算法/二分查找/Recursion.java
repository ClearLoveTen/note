package 算法.二分查找;

public class Recursion {


    public static void main(String[] args) {
        int[] a = {2, 6, 8, 12, 13, 14, 15, 19, 20, 24, 26};
        Recursion recursion = new Recursion();
        System.out.println(recursion.sercch(a, 26));


    }


    public int sercch(int[] array, int number) {
        if (number<array[0]||number>array[array.length-1]){

            return -1;
        }

        return search(array, 0, array.length - 1, number);
    }


    public int search(int[] array, int left, int right, int num) {

        if (left > right) {//千万不要忘了哦

            return -1;
        }


        int middle = (left + right) / 2;


        if (array[middle] == num) {

            return middle;

        } else if (array[middle] > num) {

            return search(array, left, middle - 1, num);
        } else {

            return search(array, middle + 1, right, num);
        }


    }

}

