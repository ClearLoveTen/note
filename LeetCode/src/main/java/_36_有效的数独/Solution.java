package _36_有效的数独;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/14 14:42
 */
public class Solution {
    Set<Character> set = new HashSet();
    Set<Character> set2 = new HashSet();

    public boolean isValidSudoku(char[][] board) {
/**
 * [
 *   ["8","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 */

        for (int i = 0; i < 9; i++) {

            //判断行
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {
                    boolean add = set.add(board[i][j]);
                    if (!add) {
                        return false;
                    }
                }

            }
            set.clear();
            //判断列
            for (int j = 0; j < 9; j++) {

                if (board[j][i] != '.') {
                    boolean add = set.add(board[j][i]);
                    if (!add) {
                        return false;
                    }
                }

            }

            set.clear();
        }


        for (int i=0;i<board.length;i=i+3){
            for (int j=0;j<board.length;j=j+3){

                if (!isValidSudoku(board,i,j)){

                    return false;
                }

            }

        }

        return true;

    }


    public boolean isValidSudoku(char[][] board, int Abscissa, int ordinate) {


        for (int i = Abscissa; i < Abscissa + 3; i++) {

            for (int j = ordinate; j < ordinate + 3; j++) {

                if (board[i][j] != '.') {
                    boolean add = set.add(board[i][j]);
                    if (!add) {
                        set.clear();
                        return false;
                    }
                }

            }

        }

        set.clear();
        return true;
    }

    public static void main(String[] args) {
        char[][] chars={{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},

                        {'.','.','.','.','8','.','.','7','9'}};
         new Solution().isValidSudoku(chars);
    }


}
