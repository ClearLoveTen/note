package _01_两数之合;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/16 14:38
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i=0;i<nums.length;i++){

            for (int j=i+1;j<nums.length;j++){

                if (nums[i]+nums[j]==target){
                    int []a={i,j};

                    return a;
                }


            }

        }
        return nums;
    }
}
