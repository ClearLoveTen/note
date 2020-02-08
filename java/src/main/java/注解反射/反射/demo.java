package 注解反射.反射;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/31 10:16
 */

import lombok.Builder;
import lombok.Data;

/**
 * 允许程序在运行期间，通过反射获取类的信息。
 * <p>
 * 性能比较慢
 */
public class demo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //每个类只能有一个CLass对象
        Class<?> a1 = Class.forName("注解反射.反射.User");
        System.out.println(a1.hashCode());
        Class<?> a2 = Class.forName("注解反射.反射.User");
        System.out.println(a2.hashCode());
        Class<?> a3 = Class.forName("注解反射.反射.User");
        System.out.println(a3.hashCode());
        Class<?> a4 = Class.forName("注解反射.反射.User");
        System.out.println(a4.hashCode());


        User user = new User();
        //通过对象创建
       Class aClass = user.getClass();
        //通过类名获得
        Class<User> userClass = User.class;

        //获取父类class
        Class superclass = userClass.getSuperclass();
        System.out.println(superclass);


        //通过class创建对象,必须要有无参数的构造方法，负责会抛出异常。
        //当没有构造方法是jdk会自动生成构造函数
        User o = (User) userClass.newInstance();

        System.out.println(o);
 }

}


class User {



    private String name;

    private int age;

}