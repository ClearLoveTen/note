package IO流;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/18 12:02
 */
public class BufferReaderDemo {
    public static void main(String[] args) throws Exception {


        //构建BufferReader传入一个FileReader然后构建对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:\\123456.txt"));
        String s;


        while ((s = bufferedReader.readLine())!=null){

            System.out.println(s);

        }


    }
}
