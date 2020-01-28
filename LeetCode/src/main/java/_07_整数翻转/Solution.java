package _07_整数翻转;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/3 22:24
 */
public class Solution {
    public int reverse(int x) {
        long lo=0;

        String s = String.valueOf(x);

        char[] chars = s.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();

        int j=chars.length-1;
        while (chars[j]==0){
            j--;
        }

        if (chars[0]=='-'){
            stringBuilder.append('-');
            for (int i=j;i>0;i--){
                stringBuilder.append(chars[i]);

            }


        }else {
            for (int i=j;i>=0;i--){

                stringBuilder.append(chars[i]);

            }


        }

        Long aLong = Long.valueOf(stringBuilder.toString());
        if (aLong>Integer.MAX_VALUE||aLong<Integer.MIN_VALUE){
            return 0;
        }

        return Integer.valueOf(stringBuilder.toString());
    }

    public static void main(String[] args) {


    }
}
