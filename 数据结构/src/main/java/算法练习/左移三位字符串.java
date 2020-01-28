package 算法练习;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/17 11:25
 */
public class 左移三位字符串 {


    public static String LeftRotateString(String str, int n) {

        if (str == " ") {
            return str;
        }
        if (str == null || n <= 0) {
            return str;
        }

        if (str == null || n <= 0) {
            return str;
        }

        Queue<Character> queue = new LinkedList<>();

        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            queue.offer(chars[i]);


        }


        for (int i = 0; i < n; i++) {

            queue.offer(queue.poll());

        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!queue.isEmpty()) {

            stringBuilder.append(queue.poll());
        }


        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        左移三位字符串.LeftRotateString("defgab", 2);
    }
}
