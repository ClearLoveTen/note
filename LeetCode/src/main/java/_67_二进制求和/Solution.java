package _67_二进制求和;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/22 17:59
 */
public class Solution {
    public String addBinary(String a, String b) {
        char[] chars = a.toCharArray();
        char[] chars1 = b.toCharArray();

        /**
         * 字符转数字
         */
        for (int i=chars.length-1,j=chars1.length-1;i>=0&&j>=0;i--,j--){
           Integer A= Integer.valueOf(String.valueOf(chars[i]));
            Integer B=  Integer.valueOf(String.valueOf(chars[j]));
        }
        char[] chars2 = new char[Math.max(a.length(), b.length())];
        int sum=0;
        int i,j;
        for ( i=chars.length-1,j=chars1.length-1;j>=0&&i>=0;j--,i--);
        return "";
    }
}
