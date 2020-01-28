package 集合.List;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {


    public static void main(String[] args) {


        Collection<Integer> c=new ArrayList<>();

        //添加
        c.add(1);

        //添加一个集合
        c.addAll(c);

        //测试是否包含一个对象
        System.out.println(c.contains(1));


        //测试是否包含一个集合
        System.out.println(c.containsAll(c));

        //使用迭代器遍历ArrayyList 集合第一种类
       for (  Iterator<Integer> iterator= c.iterator();iterator.hasNext();){

            System.out.println(iterator.next());

        }

        //使用迭代器遍历List 集合第二种
        Iterator<Integer> iterator= c.iterator();

        //第二种使用方法
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

        //第三种使用方法
        for (Integer integer : c) {

            System.out.println(integer);
        }

        //清空集合
        c.clear();

        System.out.println(c.toString());



    }
}
