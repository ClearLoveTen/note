package _05_最长回文子串;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/3 20:00
 */
public class Solution {
    public String longestPalindrome(String s) {

        if(s.length()==0||s==""){
            return s;
        }
        char[] chars = s.toCharArray();

        String string="";

        for (int i=0;i<chars.length;i++){


            for (int j=chars.length-1;j>i;j--){


                if (isHuiwen(chars,i,j)&&string.length()<j-i+1){


                    string= s.substring(i,j+1);

                }

            }




        }


        return string.length()==0?s.substring(0,1):string;

    }


    //判断是不是回文数
    public boolean isHuiwen(char []chars,int left,int right){

        while (left<right){

            if (chars[left]==chars[right]){

                left++;
                right--;

            }else {


                return false;
            }

        }



    return true;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("ac"));
    }


}