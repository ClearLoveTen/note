package stream;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author xiaotiaowa
 * @version 1.0{
 * @date 2020/2/19 13:08
 */
public class demo {

    public static void main(String[] args) {

        List<User> list = new ArrayList<User>();

        list.add(new User(1l, "张三", 10, "清华大学"));
        list.add(new User(2l, "李四", 12, "清华大学"));
        list.add(new User(3l, "王五", 15, "清华大学"));
        list.add(new User(4l, "赵六", 12, "清华大学"));
        list.add(new User(5l, "田七", 25, "北京大学"));
        list.add(new User(6l, "小明", 16, "北京大学"));
        list.add(new User(7l, "小红", 14, "北京大学"));
        list.add(new User(8l, "小华", 14, "浙江大学"));
        list.add(new User(9l, "小丽", 17, "浙江大学"));
        list.add(new User(10l, "小何", 10, "浙江大学"));
        //生成steam流
        Stream<User> stream = list.stream();
        System.out.println("学校是清华大学的user");

        //过滤浙江大学的  转换成集合进行打印
        filter(stream);


        //获取所有的学生的年龄 Java 8 中我们可以通过 `::` 关键字来访问类的构造方法，对象方法，静态方法。
        //distinct 作用去重
        age(list);

        //如获取年龄是偶数的前2名user：

        s(list);

   //计算1+1000
                long sum = LongStream.rangeClosed(0L,
                10_0000_0000L).parallel().reduce(0, Long::sum);
        System.out.println(sum);


    }

    private static void s(List<User> list) {
        System.out.println("年龄是偶数的前两位user");
        List<User> userList3 = list.stream().filter(user -> user.getAge() % 2 == 0).limit(2).collect(Collectors.toList());
        userList3.forEach(System.out::print);
    }

    private static void age(List<User> list) {
        System.out.println("所有user的年龄集合");
        List<Integer> userAgeList = list.stream().map(User::getAge).distinct().collect(Collectors.toList());
        System.out.println("userAgeList = " + userAgeList);
    }

    private static void filter(Stream<User> stream) {
        stream.filter(user -> user.getSchool().equals("浙江大学")).collect(Collectors.toList()).forEach(user->{
            System.out.println(user);
        });
    }

}
