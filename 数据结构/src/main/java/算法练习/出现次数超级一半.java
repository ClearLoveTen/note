package 算法练习;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/12 20:00
 */
public class 出现次数超级一半 {


    public int MoreThanHalfNum_Solution(int[] array) {

        final int maxInteger = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != maxInteger) {
                int t = 1;
                for (int j = i+1; j < array.length; j++) {
                    if (array[i] == array[j]) {

                        t++;
                        array[j] = maxInteger;

                    }


                }
                if (t > array.length / 2) {


                    return array[i];
                }

            }


        }


        return 0;


    }

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        出现次数超级一半 出现次数超级一半 = new 出现次数超级一半();
        出现次数超级一半.MoreThanHalfNum_Solution(a);
    }


}
