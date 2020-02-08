package 结构型模式.享元模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 14:48
 */
public class ConcretWebSite extends WebSite {
    //发布的形式
    private String type="";

    public ConcretWebSite(String type) {
        this.type = type;
    }


    @Override
    public void user(User user) {

        System.out.println(user.getName()+"在"+type+"发布了");

    }
}
