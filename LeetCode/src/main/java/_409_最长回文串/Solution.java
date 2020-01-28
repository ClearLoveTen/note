package _409_最长回文串;

import java.util.HashSet;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/17 23:31
 */
public class Solution {


    public int longestPalindrome(String s) {

        HashSet<Character> set=new HashSet<Character>();
        int maxLength=0;

        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (!set.add(aChar)){
                set.remove(aChar);
                maxLength+=2;
            }
        }



        return set.isEmpty()?maxLength:maxLength+1;

    }


}

