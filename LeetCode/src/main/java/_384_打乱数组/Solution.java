package _384_打乱数组;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/4 22:44
 */
public class Solution {

    int nums[];

    int odl[];

    public Solution(int[] nums) {
        this.nums = nums;

        // odl=new  int[nums.length];

        odl = Arrays.copyOf(nums, nums.length);

    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {

        List<Integer> integers = new LinkedList<>();


        for (int num : nums) {
            integers.add(num);
        }


        for (int i = 0; i < nums.length; i++) {

            nums[i] = integers.remove((int)(Math.random() * integers.size())*10);

        }





        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {

        return odl;
    }
}
