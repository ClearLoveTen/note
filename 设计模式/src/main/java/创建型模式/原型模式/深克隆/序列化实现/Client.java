package 创建型模式.原型模式.深克隆.序列化实现;

import java.io.*;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/20 13:59
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Mother mother = new Mother("沥青", 5);
        Student student = new Student("兔兔",56,mother);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(student);
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Student s2 = (Student) ois.readObject();


        System.out.println(student.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(student.getMather().hashCode());
        System.out.println(s2.getMather().hashCode());


    }
}
