package _22_括号生成;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xiaotiaowa
 * @version 1.0   此乃暴力方法不可取
 * @date 2019/10/14 12:15
 */
public class Solution1 {
    public static void main(String[] args) {
        new Solution1().generateParenthesis(5);
    }

    int sum;
    int left=0;
    int right=0;
    List<String> list = new ArrayList<>();

    /**
     * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合
     */
    public List<String> generateParenthesis(int n) {
        sum = n;
        gogo(new StringBuilder(n * 2));


        for (String s : list) {
            System.out.println(s);

        }

        return list;
    }


    public void gogo(StringBuilder stringBuilder) {

        if (left==sum&&right==sum) {
            System.out.println(stringBuilder.toString());
                list.add(stringBuilder.toString());
            return;
        }

        if (left<sum){
            stringBuilder.append("(");
            left++;
            gogo(stringBuilder);
            left--;
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        }


        if (right<left) {
            stringBuilder.append(")");
            right++;
            gogo(stringBuilder);
            right--;
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    Stack<Character> stack = new Stack<>();


}
