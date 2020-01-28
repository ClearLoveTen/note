package 迷宫;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/18 21:57  计算
 */
public class Labyrinth1 {

    class XY {
        private int x;
        private int y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "XY{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    private int wide;
    private int hignt;
    //储存最短路径
    private LinkedList<XY> list;


    public LinkedList<XY> getList() {
        return list;
    }

    public int[][] getChessboard() {
        return chessboard;
    }

    /**
     * 墙用2代替
     */
    private int chessboard[][];

    public Labyrinth1(int wide, int hignt) {
        list = new LinkedList<>();
        this.wide = wide;
        this.hignt = hignt;

        chessboard = new int[hignt][wide];
        for (int i = 0; i < wide; i++) {

            chessboard[0][i] = 2;
            chessboard[hignt - 1][i] = 2;
        }
        for (int i = 1; i < hignt; i++) {

            chessboard[i][wide - 1] = 2;
            chessboard[i][0] = 2;
        }


    }

    /**
     * 设置中间的阻挡物
     */
    public void setWall(int x, int y) {

        chessboard[x][y] = 2;


    }


    public void shortPath(int x, int y) {


        if (list.size() != 0 && list.peekLast().x == hignt - 2 && list.peekLast().y == wide - 2) {

            return;
        }
        list.addLast(new XY(x, y));
        chessboard[x][y] = 1;


        /**
         * 判断下方是否可走
         */

        if (x + 1 < hignt - 1 && chessboard[x + 1][y] != 2 && chessboard[x + 1][y] != 1) {
            shortPath(x + 1, y);
            if (list.peekLast() != null && list.peekLast().x == hignt - 2 && list.peekLast().y == wide - 2) {

                return;
            }
        }
        /**
         * 判断右边是否可走
         */
        if (y + 1 < wide - 1 && chessboard[x][y + 1] != 2 && chessboard[x][y + 1] != 1) {
            shortPath(x, y + 1);
            if (list.peekLast() != null && list.peekLast().x == hignt - 2 && list.peekLast().y == wide - 2) {

                return;
            }
        }
        /**
         * 判断上方是否可走
         */
        if (x - 1 > 1 && chessboard[x - 1][y] != 2 && chessboard[x - 1][y] != 1) {
            shortPath(x - 1, y);
            if (list.peekLast() != null && list.peekLast().x == hignt - 2 && list.peekLast().y == wide - 2) {

                return;
            }
        }
        /**
         * 判断左方是否可走
         */
        if (y - 1 > 1 && chessboard[x][y - 1] != 2 && chessboard[x][y - 1] != 1) {
            shortPath(x, y - 1);
            if (list.peekLast() != null && list.peekLast().x == hignt - 2 && list.peekLast().y == wide - 2) {

                return;
            }
        }

        list.pop();
        chessboard[x][y] = 0;
    }

    public static void main(String[] args) {
        Labyrinth1 labyrinth = new Labyrinth1(7, 8);
        labyrinth.setWall(4, 1);
        labyrinth.setWall(4, 2);
        labyrinth.setWall(4, 3);
        labyrinth.setWall(4, 4);
        // labyrinth.setWall(3, 4);
        labyrinth.shortPath(1, 1);


        LinkedList<XY> list = labyrinth.getList();
        for (XY xy : list) {

            System.out.println(xy);

        }

        int[][] chessboard = labyrinth.getChessboard();

        for (int[] ints : chessboard) {

            System.out.println(Arrays.toString(ints));

        }


    }

}
