package 集合.排序;

/**
 * return 结果为1 的时候进行交换
 *
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/14 10:58
 */
public class Emp  implements  Comparable<Emp>{


    private int id;
    private String name;
    private int age;

    public Emp() {
    }

    /**
     *
     * @param id
     * @param name 姓名
     * @param age   年龄
     */
    public Emp(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int hashCode() {



        return (id+age+name).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Emp) {
            Emp stu = (Emp)obj;
            return stu.toString().equals(toString());
        }
        return false;
    }

    /**
     *
     *
     * 返回值为 小于0 做交换
     * 返回值 大于 0  不做交换
     *
     *  o代表他的前一个值
     *
     *  this 代表现在值
     *
     * @param o
     * @return   先按照年龄 从大到小排序，然后按照编号 从大到小排序
     */
    @Override
    public int compareTo(Emp o) {
        if (this.equals(o)){

            return 0;
        }
        if (this.age>o.age){

            return 1;
        }else if(this.age<o.age){

            return -1;

        }else if (this.id>o.id){

            return 1;
        }else {


            return -1;
        }

    }
}
