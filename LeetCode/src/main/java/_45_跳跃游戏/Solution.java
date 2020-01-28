package _45_跳跃游戏;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/28 11:18
 */
public class Solution {


    int min;

    public int jump(int[] nums) {

        min = nums.length;
        gogo(0, 0, nums);

        return min;
    }

    /**
     * @param location 当前所在的位置
     * @param nums
     * @param num      已经走的步数
     */
    public void gogo(int location, int num, int nums[]) {

        //当前所走步数已经大于以前走走不熟
        if (num > min) {
            return;
        }
        //已经走到末尾了
        if (location == nums.length - 1) {
            min = num;
            return;
        }
        for (int i = nums[location]; i > 0; i--) {


            if (location + i > nums.length - 1) {
                continue;
            }

            gogo(location + i, num + 1, nums);
        }


    }

    public static void main(String[] args) {
        new Solution().jump(new int[]{4, 7, 5});
    }
}
