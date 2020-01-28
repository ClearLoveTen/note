package IO流.转换流;

import java.io.*;

/**
 * @author xiaotiaowa  转换流属于字符流，提供字符流和字节流之间转换
 * @version 1.0         inputSteamReader讲一个字节输入流转化为字符输入流
 * ouputSteamWirter将一个字符输出流转换成字节输出流
 * @date 2019/10/8 12:49
 */
public class demo {
    public static void main(String[] args) throws IOException {
        demo2();
    }


    /**
     * 字节输入流转换成字符输入流 (ctrl+p)查看输入参数
     */
    public static void demo() throws IOException {

        //创建一个字节输入流
        InputStream inputStream = new FileInputStream(new File("d://xiaotiaowa.txt"));
        //创建一个字节输入流转字符输入流的 解码的过程
        //InputStreamReader inputStreamReader=new InputStreamReader(inputStream,"gbk");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);


        char[] chars = new char[1024];
        //保存本次读到的数据长度
        int lenght;

        //如果长度为-1说明已经读完了
        while ((lenght = inputStreamReader.read(chars)) != -1) {

            String s = new String(chars, 0, lenght);
            System.out.println(s);
        }
        inputStream.close();
    }

    /**
     * 字节输入流读取转换成字符输入流
     * 字符数出流输出，抓换成字节输出流。
     * 转换成字节输出流 (ctrl+p)查看输入参数
     */
    public static void demo2() throws IOException {


        //输如地址
        File file = new File("d://xiaotiaowa.txt");
        //输出地址
        File file2 = new File("d://xiaotiaowahah.txt");

        InputStream  inputStream =null;

        //文件输出流
        OutputStream outputStream=null;


        //文件字节输入流 转换成文件字符输入流
        InputStreamReader inputStreamReader =null;

        OutputStreamWriter outputStreamWriter =null;
        try {


            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(file2);
            inputStreamReader = new InputStreamReader(inputStream,"utf-8");

            outputStreamWriter = new OutputStreamWriter(outputStream,"gbk");
            char[] chars = new char[1024];
            int lenght;
            while ((lenght=inputStreamReader.read(chars))!=-1){

                outputStreamWriter.write(chars,0,lenght);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            inputStreamReader.close();
            outputStreamWriter.close();

        }


    }


}
