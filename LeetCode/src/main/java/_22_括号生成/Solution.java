package _22_括号生成;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xiaotiaowa
 * @version 1.0   此乃暴力方法不可取
 * @date 2019/10/14 12:15
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().generateParenthesis(5);
    }

    int sum;
    List<String> list = new ArrayList<>();

    /**
     * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合
     */
    public List<String> generateParenthesis(int n) {
        sum = n;
        gogo(new StringBuilder(n * 20));


        for (String s : list) {
            System.out.println(s);

        }

        return list;
    }


    public void gogo(StringBuilder stringBuilder) {

        if (stringBuilder.length() == sum * 2) {

            if (checkOut(stringBuilder.toString())) {
                list.add(stringBuilder.toString());
            }
            // System.out.println(stringBuilder.toString());
            return;
        }
        stringBuilder.append("(");
        gogo(stringBuilder);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        stringBuilder.append(")");
        gogo(stringBuilder);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

    }

    Stack<Character> stack = new Stack<>();

    public boolean checkOut(String s) {
        stack.clear();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {

                stack.add(chars[i]);
                continue;
            }

            if (chars[i] == ')') {

                if (stack.isEmpty()||stack.pop()==')') {
                    return false;
                }
            }


        }


        return stack.isEmpty()?true:false;
    }


}
