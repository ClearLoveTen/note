package 创建型模式.原型模式.深克隆.序列化实现;

import java.io.Serializable;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/20 14:00
 */
public class Mother implements Cloneable,Serializable {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Mother{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mother(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
