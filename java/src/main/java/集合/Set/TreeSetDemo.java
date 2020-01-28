package 集合.Set;

import 集合.排序.Emp;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *和 TreeMap 性质类似   默认排序 ，也可以指定排序内容
 *
 *
 *
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/14 13:20
 */
public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSetDemo treeSetDemo = new TreeSetDemo();
        treeSetDemo.sort();


    }
    public void sort2(){
        TreeSet<Integer> strings = new TreeSet<>();



        for(int i=0;i<100;i++) {
            strings.add((int) (Math.random() * 1000000));
        }

        Iterator<Integer> iterator = strings.iterator();

        while (iterator.hasNext()){


            System.out.println(iterator.next());
        }

    }

    public void sort(){

        TreeSet<Emp> strings = new TreeSet<>();


        strings.add(new Emp(1, "李青", 1));
        strings.add(new Emp(1, "李青", 1));
        strings.add(new Emp(1, "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));
        strings.add(new Emp((int) (Math.random() * 1000), "李青", (int) (Math.random() * 100)));


        Iterator<Emp> iterator = strings.iterator();


        while (iterator.hasNext()) {


            System.out.println(iterator.next());
        }


    }
    }
