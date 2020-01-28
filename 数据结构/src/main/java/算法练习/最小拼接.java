package 算法练习;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/16 13:28
 */
public class 最小拼接 {


    public String PrintMinNumber(int [] numbers) {

        ArrayList<Integer> arrayList=new ArrayList<>();

        for(int i=0;i<numbers.length;i++){

            arrayList.add(numbers[i]);
        }

        arrayList.sort((o1, o2) -> {

            //比较关键点
            String s= o1+""+o2;
            String s2= o2+""+o1;
            System.out.println(s2.compareTo(s));

            return s.compareTo(s2);
        });


        StringBuilder stringBuilder=new StringBuilder();


        //Collections.sort();
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()){

            stringBuilder.append(iterator.next());
        }

return stringBuilder.toString();
    }

    public static void main(String[] args) {


        最小拼接 最小拼接 = new 最小拼接();
        int a[]={3,5,1,4,2};
        最小拼接.PrintMinNumber(a);

    }
}
