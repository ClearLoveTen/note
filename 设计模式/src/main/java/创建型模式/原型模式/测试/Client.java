package 创建型模式.原型模式.测试;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/20 12:23
 */
public class Client {


    public static void main(String[] args) {
        //创建一个母亲
        Mother mother = new Mother("张小丽",38);

        System.out.println(mother);
        Student student= new Student("胡图图", 5, mother);

        System.out.println(student);

        student.getMather().setName("晓红");

        System.out.println(mother);


    }
}
