package IO流;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/18 13:12
 */
public class BufferWriterDemo {


    public static void main(String[] args) throws Exception{

        File file = new File("");

        if (file.exists()){

            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:\\xiaotiaowa.txt"));
        bufferedWriter.write("wujiahoa");
        bufferedWriter.newLine();
        bufferedWriter.write("小跳蛙");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
