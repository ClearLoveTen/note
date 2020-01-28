package _42_接雨水;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/28 10:45
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */
public class Solution {
    public int trap(int[] height) {
        //总和
        int sum = 0;
        //左边最大数
        int maxLeft = height[0];


        //右边最大数
        int maxRight = 0;


        for (int i=1;i<height.length;i++){
            if (height[i]>maxRight){
                maxRight=height[i];
            }

        }
        for (int i = 1; i < height.length; i++) {
            //当前值比左边最大的大并且等于右边最大的
            if (height[i] >= maxLeft && height[i] == maxRight) {
                //重新定义左边最大的
                maxLeft = height[i];
                //重新计算右边最大的
                maxRight=0;
                for (int j = i + 1; j < height.length; j++) {
                    if (height[j] > maxRight) {
                        maxRight = height[j];
                    }

                }
                continue;
            }
            //当前值比左边最大的大
            if (height[i] >= maxLeft) {
                maxLeft = height[i];
                continue;
            }
            //当前值比右边最大的大
            if (height[i] == maxRight) {
                maxRight = 0;

                for (int j = i + 1; j < height.length; j++) {
                    if (height[j] > maxRight) {
                        maxRight = height[j];
                    }

                }

                continue;
            }

            sum = sum + (Math.min(maxLeft, maxRight) - height[i]);

        }


        return sum;


    }

    public static void main(String[] args) {
        Solution solution = new Solution();


        solution.trap(new int[]{
                0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    }
}
