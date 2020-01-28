package _26_删除数组的重复项;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/14 13:46
 */
public class Solution {
    public int removeDuplicates(int[] nums) {

//1 2 3 3 5 6 6 7


        int left = 0;

        int right;

        while (left + 1 < nums.length && nums[left] != nums[left + 1]) {
            left++;
        }


        right = left + 1;


        while (right + 1 < nums.length) {

            if (nums[right] == nums[right + 1]) {

                right++;
            } else {

                nums[++left] = nums[++right];


            }


        }

        return ++left;


    }

    public static void main(String[] args) {

        final Solution solution = new Solution();
        int[] a = {1, 1, 2};
        solution.removeDuplicates(a);
    }
}
