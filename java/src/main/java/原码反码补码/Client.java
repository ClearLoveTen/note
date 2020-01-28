package 原码反码补码;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/18 22:36
 */
public class Client {
    public static void main(String[] args) {


        //ASCll码
        char s='1';
        char s1='2';

        System.out.println(s+s1);
        String a="0123456789";
        char[] chars = a.toCharArray();
        for (char aChar : chars) {

            System.out.println("char "+aChar);
            System.out.println("Integer  "+Integer.valueOf(aChar));
        }





        Integer i=2;
        Integer j=-2;

        System.out.println(Integer.bitCount(i));
        //
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.bitCount(j));

        System.out.println(Integer.toBinaryString(j));



    }
}
