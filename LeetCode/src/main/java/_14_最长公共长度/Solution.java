package _14_最长公共长度;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/4 11:12
 */
public class Solution {
    //编写一个函数来查找字符串数组中的最长公共前缀。
    //如果不存在公共前缀，返回空字符串 ""。
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }

        int size = 0;
        int j = 0;
        char chars = 0;
        for (int t = 0; t < strs[0].length(); t++) {
            for (int i = 0; i < strs.length; i++) {

                String str = strs[i];
                try {
                    if (i == 0) {
                        chars = str.charAt(j);
                    } else {

                        if (chars != str.charAt(j)) {
                            return strs[0].substring(0, size);
                        }


                    }
                } catch (Exception e) {


                    return strs[0].substring(0, size);
                }


            }
            j++;
            size++;

        }


        return strs[0];
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        String []strings={"flower","flow","flight"};
        solution.longestCommonPrefix(strings);
    }
}
