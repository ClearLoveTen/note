import cn.hutool.http.HttpUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/25 17:17
 */
public class MeiTuWa {

    public static void main(String[] args) throws Exception {

        MeiTuWa meiTuWa = new MeiTuWa();
        meiTuWa.ser("http://www.mmonly.cc/mmtp/xgmn/315827.html");
    }
    Executor executorService = Executors.newCachedThreadPool();

    //存放已经访问过的路径
    HashSet<String> set = new HashSet<String>();
    //存放接下来访问的路径
    LinkedList<String> linkedList = new LinkedList<String>();

    private volatile int sum;

    private void ser(String url) {
        String html = HttpUtil.get(url);
        Document parse = Jsoup.parse(html);

        executorService.execute(() -> {
            download(url);
        });
        // new Thread(() -> download(url)).start();
        //添加接下来访问路径
        Elements elements = parse.getElementsByClass("textc");
        for (Element element : elements) {
            String href = element.attr("href");
            boolean add = set.add(href);
            if (add) {
                linkedList.add(href);
            }
        }


        System.out.println("剩余模特数量" + linkedList.size());
        try {
            ser(linkedList.removeFirst());

        }catch (Exception e){
            System.out.println("執行結束");
        }
    }

    //下载其他页图片
    private void download(String url) {
        String html = HttpUtil.get(url);

        Document parse = Jsoup.parse(html);
        Element a = parse.getElementsByClass("down-btn").first();
        String name1 = parse.getElementsByTag("h1").first().text();
        String name =name1.substring(0,name1.length()-6);


        try {
            downloadImage(a.attr("href"), name,1);
        } catch (Exception e) {
            System.out.println("找不到图片" + a.attr("href"));
        }


        String[] split = url.split("\\.");
        for (int i = 2; ; i++) {

            try {
                html = HttpUtil.get(split[0] + "." + split[1] + "." + split[2] + "_" + i + "." + split[3]);
            } catch (Exception e) {
                break;
            }

            parse = Jsoup.parse(html);
            a = parse.getElementsByClass("down-btn").first();
            //得到了图片地址
            try {
                downloadImage(a.attr("href"), name,i);
            } catch (Exception e) {
                break;
            }
        }
    }


    //java 通过url下载图片保存到本地
    public void downloadImage(String urlString, String name,int i) throws Exception {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        // 输入流
        InputStream is = con.getInputStream();
        // 1K的数据缓冲
        byte[] bs = new byte[1024];
        // 读取到的数据长度
        int len;
        // 输出的文件流
        File file1 = new File("D:\\图片下载\\" + name);
        if (!file1.exists()){
            file1.mkdir();
        }


        String filename = "D:\\图片下载\\" + name+"\\"+i + ".jpg";  //下载路径及下载图片名称
        File file = new File(filename);

    /*    if (!file.exists()){

            file.mkdirs();
            file.createNewFile();
        }*/

        FileOutputStream os = new FileOutputStream(file, true);
        // 开始读取
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        // 完毕，关闭所有链接
        System.out.println(++sum);
        os.close();
        is.close();
    }
}
