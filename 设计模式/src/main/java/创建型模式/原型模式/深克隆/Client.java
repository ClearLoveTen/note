package 创建型模式.原型模式.深克隆;



/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/20 13:40
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {




        Mother mother = new Mother("晓红", 56);


        Student student = new Student("李冰", 45, mother);

       Student clone = (Student)student.clone();

        //其他字段基本类型，和String类型可以克隆
        System.out.println(clone.hashCode());
        System.out.println(student.hashCode());

        //深克隆 引用类型可以克隆
        System.out.println(clone.getMather().hashCode());
        System.out.println(student.getMather().hashCode());

    }
}
