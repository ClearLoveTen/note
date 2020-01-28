package _164_;

import java.util.Arrays;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/4 21:52
 */
public class Solution {

    public int maximumGap(int[] nums) {

        int max = 0;
        if (nums.length < 2) {

            return 0;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            max=Math.max(max, nums[i] - nums[i - 1]);
        }


        return max;


    }

}
