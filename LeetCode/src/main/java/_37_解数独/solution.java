package _37_解数独;

import java.util.*;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/17 1:45
 */
public class solution {

    static class A {

        public int x;
        public int y;

        public A(int x, int y) {
            this.x = x;
            this.y = y;

        }
    }

    List<Character> lists = new ArrayList<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));

    char[][] chars;

    int i = 0;
    List<A> list = new ArrayList<>();



    public void solveSudoku(char[][] board) {
        chars = board;
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                if (chars[i][j] == '.') {

                    list.add(new A(i, j));

                }

            }

        }


        chongchong();
        for (char[] aChar : chars) {
            System.out.println(Arrays.toString(aChar));

        }

    }

    public void chongchong() {
        if (i==list.size()){
            return;
        }
        A a = list.get(i);
        HashSet<Character> count = count(a.x, a.y);

        if (count!=null){
            Iterator<Character> iterator = count.iterator();
            while (iterator.hasNext()){

                chars[a.x][a.y]=iterator.next();
                i++;
                chongchong();

                if (i==list.size()){
                    return;
                }
                chars[a.x][a.y]='.';
                i--;

            }
        }


    }

    /**
     * 计算 x y 当前坐标可以放的值
     *
     * @param x
     * @param y
     * @return 当前位置可以存放的值
     */
    public HashSet<Character> count(int x, int y) {

        HashSet<Character> hashSet = new HashSet(lists);
        //移除横纵坐标
        for (int i = 0; i < 9; i++) {
            hashSet.remove(chars[x][i]);
            hashSet.remove(chars[i][y]);
        }

        if (x < 3) {
            x=0;
        } else if (x < 6) {
            x=3;
        } else if (x < 9) {
            x=6;
        }
        if (y < 3) {
            y = 0;
        } else if (y < 6) {
            y = 3;
        } else if (y < 9) {
            y = 6;
        }
        for (int i=x;i<x+3;i++){

            for (int j=y;j<y+3;j++){

                hashSet.remove(chars[i][j]);

            }

        }
        return hashSet;

    }

    public static void main(String[] args) {
        new solution().solveSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}});
    }

}

