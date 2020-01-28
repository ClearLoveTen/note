package 马踏棋盘;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/26 19:37
 */
public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();


        LinkedList<Integer> T = new LinkedList<>();
        LinkedList<Integer> S = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            T.add(in.nextInt());


        }
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            int i1 = in.nextInt();
            sum2 = sum2 + i1;
            S.add(i1);

        }
        //路上的重量
        int sum[] = new int[sum2];

        for (int i = 0; i < sum.length; i++) {
            if (T.isEmpty()) {
                break;
            }

            if (T.getFirst() + sum[i] <= w) {
                Integer integer = T.removeLast();
                Integer integer1 = S.removeLast();
                for (int j = i; j < integer1 + i; j++) {
                    sum[j] = sum[j] + integer;

                }

            }


        }

        for (int i = 0; i < sum.length; i++) {

            if (sum[i] == 0) {
                System.out.println(i - 1);
                break;
            }


        }


    }


}

