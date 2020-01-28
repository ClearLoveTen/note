package 创建型模式.原型模式.测试;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/20 12:21
 */
public class Mother {


    private String name;
    private int  age;

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


}
