import java.io.UnsupportedEncodingException;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/27 0:43
 */
public class demo {


    public static void main(String[] args) throws UnsupportedEncodingException {

        String srr="25252";
;
        byte[] bytes = srr.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        System.out.println(new String(bytes));
    }
}
