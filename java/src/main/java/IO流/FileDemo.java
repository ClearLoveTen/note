package IO流;

import java.io.File;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/18 9:52
 */
public class FileDemo {
    public static void main(String[] args) {


        String path="d://马踏棋盘.txt";



        //构建file对象 带盘符是绝对路径，不带盘符相对路径
         File file = new File(path);


        //查看当前路径下文件是否存在
        file.exists();
        //是否为文件
        file.isFile();
        //是否为文件
        file.isDirectory();
        //查看当前对象大小
        System.out.println(file.length());

        System.out.println(file.toURI());


    }






}
