package _06_Z字形变换;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/3 20:48
 */
public class Solution {
    public String convert(String s, int numRows) {
        //numRows==1;


        int length = s.length();

        if (numRows == 1 || s.length() == 1)
            return s;
        //numRows==2;
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        if (numRows == 2) {
            for (int i = 0; i < 2; i++) {

                for (int j = i; j < length; j += 2) {
                    stringBuilder.append(chars[j]);
                }
            }
            return stringBuilder.toString();
        }
        //numRows>2;

        int k = (numRows - 2) * 2 + 2;
        //第一行
        for (int i = 0; i < length; i += k) {

            stringBuilder.append(chars[i]);

        }

        //中间"PINALSIGYAHRPI"
        for (int i = 1; i < numRows - 1; i++) {
            int size = i * 2;
            for (int j = i; j < length; j += size) {


                stringBuilder.append(chars[j]);
                if (size == i * 2) {
                    size = (numRows - i - 1) * 2;
                } else {

                    size = i * 2;

                }


            }


        }

        //最后一行
        for (int i = numRows - 1; i < length; i += k) {

            stringBuilder.append(chars[i]);

        }

        return stringBuilder.toString();
    }


    public static void main(String[] args) {

        Solution solution = new Solution();
        /**
         * P   I        N
         * A  L  S     I  G
         * Y A    H  R
         * P       I
         */


        solution.convert("PAYPALISHIRING",
                4);
    }
}
