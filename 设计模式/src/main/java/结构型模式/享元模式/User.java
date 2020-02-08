package 结构型模式.享元模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 14:45
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
