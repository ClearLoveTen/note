package 集合.Map;

import 集合.排序.Emp;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 底层采用红黑二叉树
 *
 * 测试使用 Comparable接口
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/14 11:54
 */
public class TreeMapDemo {



    public static void main(String[] args) {
        TreeMap<Emp,String> treeMap=new TreeMap<>();


        treeMap.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        treeMap.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        treeMap.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        treeMap.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        treeMap.put(new Emp(1,"李青",55),"李晓彤");
        treeMap.put(new Emp(3,"李青",55),"李晓彤");
        treeMap.put(new Emp(2,"李青",55),"李晓彤");
        treeMap.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        treeMap.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        treeMap.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        treeMap.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        treeMap.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");
        treeMap.put(new Emp((int)(Math.random()*1000),"李青",(int)(Math.random()*100)),"李晓彤");



        Set<Map.Entry<Emp, String>> entries = treeMap.entrySet();


        Iterator<Map.Entry<Emp, String>> iterator = entries.iterator();


        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }
    }






}
