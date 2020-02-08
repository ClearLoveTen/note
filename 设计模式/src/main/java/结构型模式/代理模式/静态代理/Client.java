package 结构型模式.代理模式.静态代理;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/28 16:39
 */
public class Client {
    public static void main(String[] args) {

        //静态代理
        new TeacherDaoProxy(new TeacherDao()).say();


        new TeacherDaoProxy(() -> {
            System.out.println("第二次讲课");

        }).say();



    }
}
