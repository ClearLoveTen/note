package _557_翻转单词;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/28 12:20
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 *       s'teL ekat edoCteeL tsetnoc
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int left = 0;

        for (int i = 0; i < chars.length; i++) {
            //满足翻转单个单词
            if (chars[i] == ' ') {

                for (int left1 = left, right = i-1; right > left1; left1++, right--) {
                    char cha = chars[left1];
                    chars[left1] = chars[right];
                    chars[right] = cha;
                }


                left=++i;
            }


        }
        for (int left1 = left, right = chars.length-1; right > left1; left1++, right--) {
            char cha = chars[left1];
            chars[left1] = chars[right];
            chars[right] = cha;
        }
        System.out.println(chars);
        return chars.toString();


    }

    public static void main(String[] args) {
        new Solution().reverseWords("Let's take LeetCode contest");
    }
}
