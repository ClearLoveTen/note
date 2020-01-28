package 算法练习;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/16 15:26
 */
public class 出现两次的整数 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {



        HashSet<Integer> map=new HashSet<>();




        for (int i=0;i<array.length;i++){

            if(!map.add(array[i])){

                map.remove(array[i]);

            }

        }
        Iterator<Integer> iterator = map.iterator();


        num1[0]=iterator.next();
        num2[0]=iterator.next();

    }
    public String ReverseSentence(String str) {


        char[] chars = str.toCharArray();

        StringBuilder stringBuilder=new StringBuilder();

        int end=chars.length-1;

        for (int i=chars.length-1;i>=0;i--){



            if(chars[i]==' ') {
                stringBuilder.append(chars,i+1,end);
                end=i-1;
            }
            if(i!=0){
                stringBuilder.append(" ");
            }
        }

        stringBuilder.append(chars,0,end);


        return stringBuilder.toString();

    }
    public boolean duplicate(int numbers[],int length,int [] duplication) {

        Set<Integer> set=new HashSet<>();

        for(int i=0;i<numbers.length;i++){
            if(!set.add(numbers[i])){

                duplication[0]=numbers[i];
                return true;

            }


        }

        return false;


    }
}
