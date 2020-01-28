package 马踏棋盘;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/17 18:47
 */
public class Horse {


    public static void main(String[] args) throws IOException {


        Horse horse = new Horse();
        horse.gogo(0, 3);
        System.out.println(Horse.sum);
        Horse.bufferedWriter.write("总共"+ Horse.sum+"种可能性");
        Horse.bufferedWriter.close();


    }

    class Coordinate implements Serializable{

        private int x;
        private int y;



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
    private final int WIDE = 6;
    /**
     * 棋盘的高
     */
    private final int HIGH = 6;

    static int sum = 0;


    /**
     * 当前已经走的步数
     */
    private static int size = 0;

    /**
     *
     */
  static   File file = new File("d:\\马踏棋盘1 .txt");

  static   BufferedWriter bufferedWriter;

    static {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int[][] plate = new int[WIDE][HIGH];


    /**
     * 存放马成功步数的集合
     */
    LinkedList<Coordinate> list = new LinkedList<>();


    public Horse() throws IOException {

        if (file.exists()) {
            file.createNewFile();
        }


    }

    /**
     * 小马跑起来
     */
    public void gogo(int i, int j) {
        size++;
        list.add(new Coordinate(i, j));

        plate[i][j] = 1;


        //进行打印
        if (size == WIDE * HIGH) {
            try {

                Iterator<Coordinate> iterator = list.iterator();

                while (iterator.hasNext()) {

                    bufferedWriter.write(iterator.next().toString());

                }
                bufferedWriter.write("\r\n"+(++sum)+"\r\n");

                bufferedWriter.flush();

                System.out.println("------------"+sum+"-------------");
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        //返回当前的所有走法
        List<Coordinate> show = show(i, j);

        if (show.size() != 0) {
            Iterator<Coordinate> iterator = show.iterator();
            while (iterator.hasNext()) {

                Coordinate next = iterator.next();
                gogo(next.x, next.y);
            }

        }
        //进行回溯
        list.removeLast();
        size--;
        plate[i][j] = 0;

    }


    /**
     * @param i
     * @param j
     * @return 返回马可以走的点的集合
     */
    public List<Coordinate> show(int i, int j) {


        List<Coordinate> list = new ArrayList<>();

        /**
         * 左1 上下判断
         */
        if (j - 1 >= 0) {

            if (i + 2 <= HIGH - 1 && plate[i + 2][j - 1] != 1) {

                list.add(new Coordinate(i + 2, j - 1));
            }
            if (i - 2 >= 0 && plate[i - 2][j - 1] != 1) {
                list.add(new Coordinate(i - 2, j - 1));


            }


        }
        /**
         * 左2 上下判断
         */
        if (j - 2 >= 0) {

            if (i + 1 <= HIGH - 1 && plate[i + 1][j - 2] != 1) {
                list.add(new Coordinate(i + 1, j - 2));


            }
            if (i - 1 >= 0 && plate[i - 1][j - 2] != 1) {

                list.add(new Coordinate(i - 1, j - 2));

            }


        }
        /**
         * 右1 上下判断
         */
        if (j + 1 <= WIDE - 1) {

            if (i + 2 <= HIGH - 1 && plate[i + 2][j + 1] != 1) {

                list.add(new Coordinate(i + 2, j + 1));

            }
            if (i - 2 >= 0 && plate[i - 2][j + 1] != 1) {

                list.add(new Coordinate(i - 2, j + 1));

            }


        }
        /**
         * 右2 上下判断
         */
        if (j + 2 <= WIDE - 1) {
            if (i + 1 <= HIGH - 1 && plate[i + 1][j + 2] != 1) {
                list.add(new Coordinate(i + 1, j + 2));

            }
            if (i - 1 >= 0 && plate[i - 1][j + 2] != 1) {

                list.add(new Coordinate(i - 1, j + 2));

            }


        }

        return list;

    }




}
