package 集合.List;

import 集合.排序.Emp;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/14 12:44
 */
public class ArrayListSort {


    public static void main(String[] args) {

        ArrayList<Emp> emps = new ArrayList<>();


        emps.add(new Emp((int)(Math.random()*1000),"李小青",(int)(Math.random()*100)));
        emps.add(new Emp((int)(Math.random()*1000),"李小青",(int)(Math.random()*100)));
        emps.add(new Emp((int)(Math.random()*1000),"李小青",(int)(Math.random()*100)));
        emps.add(new Emp((int)(Math.random()*1000),"李小青",(int)(Math.random()*100)));
        emps.add(new Emp((int)(Math.random()*1000),"李小青",(int)(Math.random()*100)));
        emps.add(new Emp((int)(Math.random()*1000),"李小青",(int)(Math.random()*100)));
        emps.add(new Emp((int)(Math.random()*1000),"李小青",(int)(Math.random()*100)));
        emps.add(new Emp((int)(Math.random()*1000),"李小青",(int)(Math.random()*100)));
        emps.add(new Emp((int)(Math.random()*1000),"李小青",(int)(Math.random()*100)));
        for (Emp emp : emps) {
            System.out.println(emp);

        }
        System.out.println("华丽分割线-----------------------------------------------------------");

        //实现他的接口
        emps.sort((o1, o2) -> {
            if (o1.getAge()>o2.getAge()){

                return 1;
            }else if(o1.getAge()<o2.getAge()){

                return -1;

            }else if (o1.getId()>o2.getId()){

                return 1;
            }else {


                return -1;
            }
        });

        for (Emp emp : emps) {
            System.out.println(emp);

        }

    }
}
