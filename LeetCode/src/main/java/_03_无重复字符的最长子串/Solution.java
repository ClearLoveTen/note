package _03_无重复字符的最长子串;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/3 18:49
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLenght = 0;
        char[] chars = s.toCharArray();

        int first=0;
        for (int i = 0; i < chars.length; i++) {


            for (int j=first;j<i;j++){

                if (chars[j]==chars[i]){
                    first=j+1;
                    break;
                }
            }
            if (maxLenght<i-first+1) {
                maxLenght = i - first + 1;
            }

        }


        return maxLenght;
    }
}