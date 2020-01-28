package 集合.Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/20 15:19
 */
public class TreeSetANDArrayList {

    public static void main(String[] args) {

        TreeSet<ArrayList<Integer>> a=new TreeSet<>((o1, o2) -> {

           if (o1.equals(o2)){
                return 0;
            }
            if (o1.get(0)>o2.get(0)){
                return 1;
            }else return -1;


        });




        for (int i=0;i<10000;i++){

            ArrayList<Integer> integers = new ArrayList<>();
          int b=  (int)(Math.random()*100)+1;

            integers.add(b);

            a.add(integers);
        }

        System.out.println(a.size());


        Iterator<ArrayList<Integer>> iterator = a.iterator();

        while (iterator.hasNext()){

            ArrayList<Integer> next = iterator.next();

            System.out.println(next.get(0));


        }


    }
}
