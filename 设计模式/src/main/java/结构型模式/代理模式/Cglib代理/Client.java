package 结构型模式.代理模式.Cglib代理;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/28 17:37
 *
 * cglib 动态代理
 * 不用实现接口
 */
public class Client {
    public static void main(String[] args) {

        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(new TeacherDao()).getProxyInstance();
        System.out.println(proxyInstance.teach());

    }
}
