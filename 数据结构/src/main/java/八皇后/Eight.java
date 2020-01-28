package 八皇后;

import java.util.Arrays;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/18 14:56
 */
public class Eight {


    /**
     * 棋盘的宽
     */
    private  int wide ;
    /**
     * 棋盘的高
     */
    private  int hight ;


    private int plate[][] ;

    int sum=0;
    private int num = 0;

    public Eight(int eight) {
        this.wide = eight;
        this.hight = eight;
       plate = new int[wide][hight];
    }

    /**
     * gogo
     */
    public void gogo() {


        for(int j=0;j<wide;j++){

            gogo(hight-1,j);
        }

    }

    /**
     * gogo
     *
     * @param x 从左下角开始试
     * @param y
     */
    private void gogo(int x, int y) {

        plate[x][y] = ++num;

        if (num == hight) {
            System.out.println("第"+(++sum)+"种可能性");
            for (int[] ints : plate) {

                System.out.println(Arrays.toString(ints));

            }

        }

        for (int i = 0; i < plate.length; i++) {

            if (bo(x - 1, i)) {

                gogo(x - 1, i);

            }


        }

        plate[x][y] = 0;
        num--;

    }


    /**
     * @return 该点是否可以放皇后
     */
    public boolean bo(int x, int y) {

        /**
         * 当前列前边是否放过元素
         */
        for (int i = hight-1; i > x; i--) {


            if (plate[i][y] != 0) {

                return false;
            }


        }
        /**
         * 判断这'/'斜面上是否放过元素
         */

        for (int i = x + 1, j = y - 1; i < hight && j >= 0; i++, j--) {

            if (plate[i][j] != 0) {

                return false;
            }


        }
        /**
         * 判断这'\'斜面上是否放过元素
         */

        for (int i = x + 1, j = y + 1; i < hight && j <wide; i++, j++) {

            if (plate[i][j] != 0) {

                return false;
            }


        }

        return true;
    }


    public static void main(String[] args) {

        /**
         * 输入x皇后
         */
        Eight eight = new Eight(80);
        eight.gogo();

    }
}
