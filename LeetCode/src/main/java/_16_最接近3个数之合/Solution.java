package _16_最接近3个数之合;

import java.util.Arrays;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/4 14:30
 */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {

        int mixNum = Integer.MAX_VALUE;
        int num = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {


            for (int j = i+1; j < nums.length - 1; j++) {


                for (int k = j+1; k < nums.length; k++) {
                    if ( Math.abs(nums[i] + nums[j] + nums[k] - target)<mixNum){
                        mixNum=Math.abs(nums[i] + nums[j] + nums[k] - target);
                        num=nums[i] + nums[j] + nums[k];
                    }


                }


            }


        }


        return num;
    }

    public static void main(String[] args) {

        int a[]={-1,2,1,-4};
        Solution solution = new Solution();
        solution.threeSumClosest(a,1);
    }
}
