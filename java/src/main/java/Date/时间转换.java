package Date;




import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/11/23 18:05
 *
 * TimeUnit.DAYS //天
 * TimeUnit.HOURS //小时
 * TimeUnit.MINUTES //分钟
 * TimeUnit.SECONDS //秒
 * TimeUnit.MILLISECONDS //毫秒
 *。
 */
public class 时间转换 {
    public static void main(String[] args) {

        String aa = "2019-11-11T16:00:00.000Z";


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

        try {
            System.out.println(sdf.parse(aa));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
