package 行为型模式.模板模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 16:18
 */
public class Client {
    public static void main(String[] args) {

        Soyamilk soyamilk=new RedBeadSoyamile();
        soyamilk.make();



        Soyamilk soyamilk1=new PureSoyamile();
        System.out.println("纯豆浆");
        soyamilk1.make();
    }
}
