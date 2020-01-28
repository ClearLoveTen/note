package 集合.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Spliterator;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/14 13:28
 */
public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();


        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(12);
        linkedHashSet.add(11);
        linkedHashSet.add(4);
        linkedHashSet.add(8);
        linkedHashSet.add(1);
        linkedHashSet.add(9);
        linkedHashSet.add(3);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(5);

        Iterator<Integer> iterator = linkedHashSet.iterator();


        while (iterator.hasNext()){


            System.out.println(iterator.next());
        }

        //

    }
}
