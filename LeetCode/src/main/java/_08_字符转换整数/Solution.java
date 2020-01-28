package _08_字符转换整数;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/3 22:49
 */

public class Solution {
    public int myAtoi(String str) {
        str = str.trim();

        String pattern = "^[\\+\\-\\d]\\d*";//正则表达式，表示以正号或负号或数字开头，且后面是0个或多个数字
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        String res = "";
        if (m.find()) {//能匹配到
            res = str.substring(m.start(), m.end());
        } else {//不能匹配到
            return 0;
        }

        //能匹配到但只有一个+-号，也返回0
        if (res.length() == 1 && (res.charAt(0) == '+' || res.charAt(0) == '-')) {
            return 0;
        }

        try {
            int r = Integer.parseInt(res);
            return r;
        } catch (Exception e) {
            return res.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}


