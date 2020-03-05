package 原码反码补码;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/18 22:36
 */
public class Client {
    public static void main(String[] args) {




        System.out.println(-13>>>2);
        System.out.println(5>>2);

        int a=13;
        int b=-13;

        a=a^b;
        b=a^b;
        a=a^b;



        System.out.printf("%40s\n",Integer.toBinaryString(a)); //1101

        System.out.printf("%40s\n",Integer.toBinaryString(b)); //11111111111111111111111111110011

        //按位与
        System.out.printf("%40s\n",Integer.toBinaryString(a&b));
        //按位或
        System.out.printf("%40s\n",Integer.toBinaryString(b|a));
        //按位异或
        System.out.printf("%40s\n",Integer.toBinaryString(b^a));
        //按位取反
        System.out.printf("%40s\n",Integer.toBinaryString(~a));
        System.out.printf("%40s\n",Integer.toBinaryString(~b));

        //a b 分别左移
        System.out.printf("%40s\n",Integer.toBinaryString(a<<1));
        System.out.printf("%40s\n",Integer.toBinaryString(b<<1));
        //a b 分别右移
        System.out.printf("%40s\n",Integer.toBinaryString(a>>1));
        System.out.printf("%40s\n",Integer.toBinaryString(b>>1));

        //a b无符号右移
        System.out.printf("%40s\n",Integer.toBinaryString(a>>>1));
        System.out.printf("%40s\n",Integer.toBinaryString(b>>>1));

      /*  //ASCll码
        char s = '1';
        char s1 = '2';
        System.out.println(s + s1);
        String a = "0123456789";
        char[] chars = a.toCharArray();
        for (char aChar : chars) {

            System.out.println("char " + aChar);
            System.out.println("Integer  " + Integer.valueOf(aChar));
        }

        Integer i = 2;
        Integer j = -2;

        System.out.println(Integer.bitCount(i));
        //
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.bitCount(j));

        System.out.println(Integer.toBinaryString(j));
*/

    }
}
