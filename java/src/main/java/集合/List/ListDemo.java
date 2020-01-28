package 集合.List;


/**
 * List 集合方法展现
 * <p>
 * 可以实现队列的功能，；  移除一个元素，后面的元素向前补位
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) {

        List<Integer> c = new ArrayList<>();
        //添加
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(5);

        Collections.sort(c);
        //list数组上复制部分片段下来
        List<Integer> integers = c.subList(0, 5);

        for (int i = 0; i < 5; i++) {

            c.remove(0);
        }


        //移除一个对象
        c.remove(0);
        c.add(4, 5);

        //添加一个集合
        c.addAll(c);


        //测试是否包含一个对象
        System.out.println(c.contains(1));


        //测试是否包含一个集合
        System.out.println(c.containsAll(c));


        //查找第一个出现的索引
        System.out.println(c.indexOf(1));

        //最后一个出现的索引

        System.out.println(c.lastIndexOf(1));


        //使用迭代器遍历ArrayyList 集合第一种类
        for (Iterator<Integer> iterator = c.iterator(); iterator.hasNext(); ) {

            // System.out.println(iterator.next());

        }

        //使用迭代器遍历List 集合第二种
        Iterator<Integer> iterator = c.iterator();

        //第二种使用方法
        while (iterator.hasNext()) {

            //System.out.println(iterator.next());
        }

        //第三种使用方法
        for (Integer integer : c) {

            //System.out.println(integer);
        }

        //清空集合
        c.clear();

        System.out.println(c.toString());


    }
}
