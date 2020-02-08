package 扫雷;

import cn.hutool.poi.word.WordUtil;

import java.time.Year;
import java.util.Random;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/1 22:17
 */
public class service {

    private  Status[][] mine;

    private boolean firstClick = true;
    private int width;
    private  int high;

    /**
     * 当前雷区存放的雷数量
     */
    private int number;

    /**
     * @param width 宽
     * @param high  高
     */
    public service(int width, int high, int number) {

        this.width = width;
        this.high = high;
        this.number = number;
        this.mine = new Status[high][width];

        for (int i = 0; i < mine.length; i++) {

            for (int j = 0; j < mine[0].length; j++) {

                mine[i][j] = Status.NOT_EXIST;
            }

        }

    }


    /**
     * 判断当前位置是否存在雷，存在 true ，负责false;
     * @param x
     * @param y
     * @return
     */
    public boolean isExist(int x,int y){


     return mine[x][y]==Status.EXIST?true:false;
    }

    /**
     * 计算当前点位雷数量，如何又雷返回-1，否则返回类数量
     * @param x
     * @param y
     * @return
     */
    public int click(int x, int y) {

        /**
         * 如果第一次点击,初始化雷区
         */
        if (firstClick) {
            init(x, y);
            firstClick = false;
        }

        /**
         * 计算出当前点位周围雷区数量
         */
        if (mine[x][y] != Status.EXIST)

            return countNumber(x, y);
        else {
            return -1;
        }
    }

    /**
     * 计算当前点位周围的雷数量
     *
     * @param x
     * @param y
     * @return
     */
    private int countNumber(int x, int y) {
        int sum = 0;

        //上方有点位
        if (x - 1 != -1) {
            //正上方
            if (mine[x - 1][y] == Status.EXIST) {
                ++sum;
            }
            //上左
            if (y - 1 != -1 && mine[x - 1][y - 1] == Status.EXIST) {
                ++sum;
            }
            //上右
            if (y + 1 != width && mine[x - 1][y + 1] == Status.EXIST) {
                ++sum;

            }
        }
        //下方有点位
        if (x + 1 != high) {
            //正下方
            if (mine[x + 1][y] == Status.EXIST) {
                ++sum;
            }
            //下左
            if (y - 1 != -1 && mine[x + 1][y - 1] == Status.EXIST) {
                ++sum;
            }
            //下右
            if (y + 1 != width && mine[x + 1][y + 1] == Status.EXIST) {
                ++sum;

            }
        }

        //正左
        if (y - 1 != -1 && mine[x][y-1] == Status.EXIST) {
            ++sum;
        }

        //正右
        if (y + 1 != width && mine[x][y+1] == Status.EXIST) {
            ++sum;
        }
        return sum;
    }

    /**
     * 初始化雷区
     *
     * @param x 第一次点击的坐标
     * @param y
     */
    private void init(int x, int y) {
        Random random = new Random();
        int num;
        int t = 0;
        while (t != number) {
            num = random.nextInt(width * high);
            if (mine[num / width][num % width] == Status.NOT_EXIST ) {
                if( num / width != x || num % width != y){
                mine[num / width][num % width] = Status.EXIST;
                t++;
            }}
        }
    }



    public void print() {

        for (int i = 0; i < high; i++) {

            for(int j=0;j<width;j++){
                if (mine[i][j]==Status.EXIST){
                    System.out.print(mine[i][j]+"     ");

                }else {
                    System.out.print(mine[i][j]+" ");

                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        service service = new service(9, 9, 40);

        System.out.println(service.click(8, 0));
        service.print();


    }
}
