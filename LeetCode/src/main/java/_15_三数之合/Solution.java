package _15_三数之合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * @author xiaotiaowa  题解排序加双指针+TreeSet排序判重
 * @version 1.0
 * @date 2019/10/4 12:00
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        TreeSet<List<Integer>> treeSet = new TreeSet<>((o1, o2) -> {

            for (int i=0;i<3;i++){
                if (o1.get(i)>o2.get(i)){

                    return 1;
                }
                if (o1.get(i)<o2.get(i)){

                    return -1;
                }


            }




            return 0;
        });


        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    treeSet.add(list);
                    left++;
                    right--;

                } else if (sum > 0) {

                    right--;

                } else if (sum < 0) {

                    left++;

                }


            }


        }


        List<List<Integer>> lists = new ArrayList<>(treeSet);
        return lists;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[]={-1,-2,-3,4,1,3,0,3,-2,1,-2,2,-1,1,-5,4,-3};
        solution.threeSum(a);
    }
}
