package IO流;

import java.io.*;
import java.lang.reflect.Type;

/**
 * @author xiaotiaowa
 * @version 1.0  复制照片
 * @date 2019/9/18 13:30
 */

public class InPutStreamDemo {



    public static void main(String[] args) throws IOException {

        //文件来源
        File file = new File("C:\\Users\\111\\Desktop\\辛凯轩.jpg");
        File file1 = new File("d:\\辛凯轩.jpg");
        InputStream inputStream = new FileInputStream(file);

        OutputStream outputStream = new FileOutputStream(file1);

         byte a[]=new byte [1024];
       while (inputStream.read(a)!=-1){


           outputStream.write(a);


       }
        inputStream.close();
        outputStream.close();


    }


}
