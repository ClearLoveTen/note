package _70_爬楼梯;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/28 12:11
 */
public class Solution1 {
    public int climbStairs(int n) {

        if (n==1||n==2)
            return n;
        int sum=0;
        int a=1;
        int b=2;

        for (int i=3;i<=n;i++){

            sum=a+b;
            a=b;
            b=sum;

        }


        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution1().climbStairs(45));
    }
}
