package 算法练习;

import java.util.ArrayList;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/17 10:44
 */
public class 合为sum的整数序列 {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(sum==1&&sum==2){
            return list;

        }
        int i = 1;
        int j = 2;
        int S = i + j;


        while (j!=i&&j<sum) {

            if (S < sum) {

                S=S+(++j);
            } else if (S > sum) {
                S=S-i++;
                if(i==j&&sum==S){
                    ArrayList<Integer> an = new ArrayList<Integer>();
                    an.add(j-1);
                    an.add(j);
                    list.add(an);

                }

            } else {


                ArrayList<Integer> an = new ArrayList<Integer>();
                for (int t = i; t <= j; t++) {

                    an.add(t);
                }
                list.add(an);

                S=S+(++j);

            }

        }
        if(list.size()>1&&list.get(list.size()-1).equals(list.get(list.size()-2))){

            list.remove(list.size()-1);


        }

            return list;
    }



    public static void main(String[] args) {
        合为sum的整数序列.FindContinuousSequence(3);
    }
}
