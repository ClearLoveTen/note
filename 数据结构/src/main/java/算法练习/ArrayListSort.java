package 算法练习;

import java.util.ArrayList;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/16 12:42
 */
public class ArrayListSort {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();

            if(input.length==0){
                return arrayList;
            }
        if(k>input.length){

            return null;
        }



        for (int i = 0; i < k; i++) {
            int min = i;
            for (int j = i; j < input.length; j++) {

                if (input[min] > input[j]) {

                    min =j;
                }


            }


            int t=input[i];
            input[i]=input[min];
            input[min]=t;


        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);

        }

        return arrayList;

    }

    public static void main(String[] args) {
        ArrayListSort arrayListSort = new ArrayListSort();
        int []i={4,5,1,6,2,7,3,8};
        arrayListSort.GetLeastNumbers_Solution(i,10);
    }

}
