package _08_字符转换整数;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/3 22:49
 */

public class Solution1 {
    public int myAtoi(String str) {

        String trim = str.trim();

        long num;
        try {
            num=Long.valueOf(trim);
        }catch (Exception e){
            return 0;
        }

        if (num>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if (num<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return Integer.valueOf(trim);

    }
}


