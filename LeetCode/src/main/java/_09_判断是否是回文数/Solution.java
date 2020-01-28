package _09_判断是否是回文数;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/3 22:55
 */
public class Solution {
    public boolean isPalindrome(int x) {

        if (x<0){
            return false;
        }
        if (0<=x&&x<=9){
            return true;
        }
        char[] chars= String.valueOf(x).toCharArray();

        int first=0;
        int last=chars.length-1;

        while (last>first){
            if(chars[last]==chars[first]){

                first++;
                last--;
            }else {
                return false;
            }


        }



        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome(222222222);
    }

}
