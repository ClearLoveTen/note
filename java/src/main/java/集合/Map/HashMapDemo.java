package 集合.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * 底层采用哈希表， 先计算hashcode 然后进行取余， 接下来插入链表中。
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/14 11:23
 */
public class HashMapDemo  {




    public static void main(String[] args) {


        Map map1=new HashMap();

        /**
         * hashcode相等，equlse不一定相等，固定equlse相等  hashcode 一定相等：
         */
/*        Map<String ,String > map=new HashMap<>();
        String n="武佳豪";
        System.out.println(n.hashCode());
        Integer  a= 27088189;
        System.out.println(a.hashCode());*/


        Map<Integer,String> map=new HashMap<>();


      /* for (int i=0;i<99;i++) {
            map.put(i, (int) (Math.random() * 10000000)+"");

        }
*/




        map.put(1,"");
        map.put(4,"");
        map.put(5,"");
        map.put(3,"");
        map.put(7,"");
        map.put(0,"");
        map.put(2,"");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();


        while (iterator.hasNext()){


            System.out.println(iterator.next());
        }


    }




}
