package 马踏棋盘;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/17 18:47
 */
public class HorseTanXin {


 static  int num=0;

    class Coordinate {

        private int x;
        private int y;
        /**
         * 当前左边下次可以走的点
         */
        private int time;

        public Coordinate(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Coordinate{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    /**
     * 棋盘的宽
     */
    private final int WIDE = 8;
    /**
     * 棋盘的高
     */
    private final int HIGH = 8;


    /**
     *当前已经走的步数
     *
     */
    private  static int size=0;

    public int[][] plate = new int[WIDE][HIGH];


    /**
     * 存放马成功步数的集合
     */
    LinkedList<Coordinate> list=new LinkedList<>();



    /**
     * 小马跑起来
     */
    public void gogo(int i,int j){
        size++;
        list.add(new Coordinate(i,j));

        plate[i][j]=1;


        //进行打印
        if(size==WIDE*HIGH){




            Iterator<Coordinate> iterator = list.iterator();

            while (iterator.hasNext()){

                System.out.println(iterator.next());
            }
            num++;
            System.out.println("----------------------");

        }

        //返回当前的所有走法
        List<Coordinate> show = show(i, j);



        if(show.size()!=0) {
            show.sort((o1, o2) -> o1.time>o2.time?1:-1);
            Iterator<Coordinate> iterator = show.iterator();
            while (iterator.hasNext()) {

                Coordinate next = iterator.next();
                gogo(next.x, next.y);
            }

        }
        //进行回溯
        list.removeLast();

        size--;
        plate[i][j]=0;

    }



    /**
     *
     * @param i
     * @param j
     * @return  返回马可以走的点的集合
     */
    public List<Coordinate> show(int i, int j) {


        List<Coordinate> list = new ArrayList<>();

        /**
         * 左1 上下判断
         */
        if (j - 1 >= 0) {

            if (i + 2 <= HIGH-1 && plate[i + 2][j - 1] != 1) {

                list.add(new Coordinate(i + 2, j - 1,count(i + 2, j - 1)));
            }
            if (i - 2 >= 0 && plate[i - 2][j - 1] != 1) {
                list.add(new Coordinate(i - 2, j - 1,count(i - 2, j - 1)));


            }


        }
        /**
         * 左2 上下判断
         */
        if (j - 2 >= 0) {

            if (i + 1 <= HIGH-1 && plate[i + 1][j - 2] != 1) {
                list.add(new Coordinate(i + 1, j - 2,count(i + 1, j - 2)));


            }
            if (i - 1 >= 0 && plate[i - 1][j - 2] != 1) {

                list.add(new Coordinate(i - 1, j - 2,count(i - 1, j - 2)));

            }


        }
        /**
         * 右1 上下判断
         */
        if (j + 1 <= WIDE-1) {

            if (i + 2 <= HIGH-1 && plate[i + 2][j + 1] != 1) {

                list.add(new Coordinate(i + 2, j + 1,count(i + 2, j + 1)));

            }
            if (i - 2 >= 0 && plate[i - 2][j + 1] != 1) {

                list.add(new Coordinate(i - 2, j + 1,count(i - 2, j + 1)));

            }


        }        /**
         * 右2 上下判断
         */
        if (j + 2 <= WIDE-1) {
            if (i + 1 <= HIGH-1 && plate[i + 1][j + 2] != 1) {
                list.add(new Coordinate(i + 1, j + 2,count(i + 1, j + 2)));

            }
            if (i - 1 >= 0 && plate[i - 1][j + 2] != 1) {

                list.add(new Coordinate(i - 1, j + 2,count(i - 1, j + 2)));

            }


        }

        return list;

    }


    /**
     * @return 下次可以走的点数量
     */
    public int count(int i, int j) {

        int num=0;
        /**
         * 左1 上下判断
         */
        if (j - 1 >= 0) {

            if (i + 2 <= HIGH-1 && plate[i + 2][j - 1] != 1) {

                  num++;
            }
            if (i - 2 >= 0 && plate[i - 2][j - 1] != 1) {
                num++;

            }


        }
        /**
         * 左2 上下判断
         */
        if (j - 2 >= 0) {

            if (i + 1 <= HIGH-1 && plate[i + 1][j - 2] != 1) {

                num++;

            }
            if (i - 1 >= 0 && plate[i - 1][j - 2] != 1) {

                num++;

            }


        }
        /**
         * 右1 上下判断
         */
        if (j + 1 <= WIDE-1) {

            if (i + 2 <= HIGH-1 && plate[i + 2][j + 1] != 1) {
                num++;

            }
            if (i - 2 >= 0 && plate[i - 2][j + 1] != 1) {

                num++;
            }


        }        /**
         * 右2 上下判断
         */
        if (j + 2 <= WIDE-1) {
            if (i + 1 <= HIGH-1 && plate[i + 1][j + 2] != 1) {
                num++;

            }
            if (i - 1 >= 0 && plate[i - 1][j + 2] != 1) {

                num++;

            }


        }

        return num;
    }


    public static void main(String[] args) {


        HorseTanXin horse = new HorseTanXin();
        horse.gogo(4,4);
        System.out.println(HorseTanXin.num);


    }


}
