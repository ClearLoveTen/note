package 算法练习;

import java.util.ArrayList;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/16 10:18
 */
public class 从外向里打印数组 {
    int length;

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        length = matrix.length;


        if (length == 1) {
            list.add(matrix[0][0]);
            return list;
        }

        for (int i = 0; i < length / 2; i++) {

            printMatrix(matrix, i);
        }
        if (length % 2 == 1) {
            list.add(matrix[length / 2][length / 2]);

        }

        return list;

    }

    public void printMatrix(int[][] matrix, int t) {


        //上方打印
        for (int i = t; i < length - t - 1; i++) {
            list.add(matrix[t][i]);

        }
        //右边打印
        for (int i = t; i < length - t - 1; i++) {
            list.add(matrix[i][length-t-1]);

        }
        //下方方打印
        for (int i = length - t - 1; i > t; i--) {
            list.add(matrix[matrix.length - t - 1][i]);

        }
        //左方打印
        for (int i = length - t - 1; i > t; i--) {
            list.add(matrix[i][t]);

        }


    }

    public static void main(String[] args) {
        int [][]a=
                           {{1 ,2, 3,4},
                           {5 ,6 ,7, 8},
                           {9,10,11,12},
                           {13,14,15,16}};

        从外向里打印数组 从外向里打印数组 = new 从外向里打印数组();
        从外向里打印数组.printMatrix(a);
    }
}
