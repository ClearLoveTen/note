package 集合.Map;

import 集合.排序.Emp;

import java.util.HashMap;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/14 14:00
 */
public class HashMapHashCode {

    public static void main(String[] args) {


        HashMap<Emp, String> ha = new HashMap<Emp, String>();
        Emp e = new Emp(55, "黎明", 5);
        Emp e2 = new Emp(55, "黎明", 5);
        System.out.println(e.hashCode());
        System.out.println(e2.hashCode());


        System.out.println(ha.put(e, "hah"));
        System.out.println(ha.put(e2, "hah"));
        System.out.println(ha.put(e, "hah"));


    }
}
