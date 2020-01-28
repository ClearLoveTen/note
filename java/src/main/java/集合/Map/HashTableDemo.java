package 集合.Map;

import 集合.排序.Emp;

import java.util.*;

/**
 *
 * Hshtable 无法实现排序，如果想排序，建议使用 treeMAP
 *
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/14 12:57
 */
public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<Emp,String> hashTable=new Hashtable<>();


        hashTable.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        hashTable.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        hashTable.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        hashTable.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        hashTable.put(new Emp(1,"李青",55),"李晓彤");
        hashTable.put(new Emp(3,"李青",55),"李晓彤");
        hashTable.put(new Emp(2,"李青",55),"李晓彤");
        hashTable.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        hashTable.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        hashTable.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        hashTable.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        hashTable.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        hashTable.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");


        Set<Map.Entry<Emp, String>> entries = hashTable.entrySet();



        Iterator<Map.Entry<Emp, String>> iterator = entries.iterator();
        final Map.Entry<Emp, String> next = iterator.next();
        Map.Entry<Emp, String> next1 = iterator.next();

        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }




    }
}
