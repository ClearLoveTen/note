package IO流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/18 10:15
 */
public class FileWriterDemo {

    public static void main(String[] args) throws IOException {

        String path="d://a.txt";



        //构建file对象 带盘符是绝对路径，不带盘符相对路径
        File file = new File(path);
        if(!file.exists()){

            file.createNewFile();

        }


        FileWriter fileWriter = new FileWriter(file);

        /**
         * 指定是否追加写入  true  false(默认）不追加
         */
        //FileWriter fileWriter = new FileWriter(file,false);


        fileWriter.write("1111");

        //换行符  windowx \r\n
        //mac \r
        //linux \n
        fileWriter.write("2222");
        fileWriter.write("33333");
        fileWriter.flush();
        fileWriter.close();


    }
}
