package 集合.Set;

import 集合.排序.Emp;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 *  不能实现 排序 底层 hashmap  值都在key里边放着。
 *
 *
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/14 13:14
 */
public class HashSetDemo {


    public static void main(String[] args) {

        HashSet<Emp> strings = new HashSet<>();


        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));
        strings.add(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)));


        Iterator<Emp> iterator = strings.iterator();


        while (iterator.hasNext()){


            System.out.println(iterator.next());
        }


    }






}
