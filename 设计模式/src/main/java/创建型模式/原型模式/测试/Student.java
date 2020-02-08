package 创建型模式.原型模式.测试;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/20 12:22
 */
public class Student {
    private String name;
    private int  age;
    private Mother mother;

    public Student(String name, int age, Mother Mother) {
        this.name = name;
        this.age = age;
        this.mother = Mother;
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

    public Mother getMather() {
        return mother;
    }

    public void setMather(Mother mather) {
        this.mother = mather;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mother=" + mother +
                '}';
    }
}
