package _27_移除元素;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/17 0:28
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例 1:
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int removeElement(int[] nums, int val) {

        int right = -1;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {
                if (right == -1) {
                    right = i;
                }

                for (j = right + 1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        right = j;
                        nums[i] = nums[i] ^ nums[j];
                        nums[j] = nums[i] ^ nums[j];
                        nums[i] = nums[i] ^ nums[j];
                        break;
                    }


                }
                if (j == nums.length) {
                    return i;
                }


            }


        }
        return 0;
    }

    public static void main(String[] args) {
        new Solution().removeElement(new int[]{3, 2, 2, 3}, 3);
    }
}
