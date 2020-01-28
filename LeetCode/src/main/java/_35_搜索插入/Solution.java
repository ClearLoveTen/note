package _35_搜索插入;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/2 17:22
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
