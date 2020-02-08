package 结构型模式.享元模式;


/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 14:38
 * <p>
 * 蝇量模式
 * 常用于系统底层开发，解决系统的性能问题。像数据库连接池，里面都是创建好的连接对象，
 * 在这些连接对象中有我们需要的则直接拿来用，避免重新创建，如果没有我们需要的，则创建一个
 * <p>
 * 内部状态 指对象共享出来的信息，不受外部的变化而变化
 * <p>
 * 外部状态 指对象依赖的一个标记，随环境变化而变化，不共享。
 */
public class Client {

    public static void main(String[] args) {

        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite a = webSiteFactory.getConcretWebSite("公众号");

        WebSite b = webSiteFactory.getConcretWebSite("公众号");

        //判断是否为同一个对象
        System.out.println(a == b);

        User li = new User("沥青");
        a.user(li);
        b.user(li);

        //当前创建的对象个数
        System.out.println(webSiteFactory.getSize());
        WebSite c = webSiteFactory.getConcretWebSite("微博");


        System.out.println(webSiteFactory.getSize());


    }
}
