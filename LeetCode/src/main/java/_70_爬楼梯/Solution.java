package _70_爬楼梯;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/28 12:11
 *
 * 第一种方法写法简单，时间复杂度特别高
 */
public class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        if
        (n==2){
            return 2;
        }

        return climbStairs(n-1) +climbStairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(45));
    }
}
