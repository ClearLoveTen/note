package IO流;

import java.io.File;
import java.io.FileReader;

/**
 * @author xiaotiaowa 文件输入流
 * @version 1.0
 * @date 2019/9/18 10:27
 */
public class FileReaderDemo {


    public static void main(String[] args)throws Exception {


        File file = new File("C:\\Users\\111\\Desktop\\git笔记.txt");


        FileReader fileReader=new FileReader(file);


        //一个一个读取
 /*       int a;
        while ((a=fileReader.read())!=-1){

            System.out.print((char)a);
        }*/

        char[] chars = new char[1024];
        //读到的数据个数
        int len;
        while ((len=fileReader.read(chars))!=-1){

            //数组转换字符串打印输出
            System.out.print(new String(chars,0,len));


        }
        fileReader.close();





    }

}
