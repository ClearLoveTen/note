package _15_三数之合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiaotiaowa  题解排序加双指针+简单版本
 * @version 1.0
 * @date 2019/10/4 12:00
 */
public class Solution1 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();


        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            //去掉重复的
            if (i>1&&nums[i]==nums[i-1]){
                break;
            }
            int left = i + 1;

            int right = nums.length - 1;

            while (left < right) {

                sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[left]);
                    list1.add(nums[right]);
                    list.add(list1);
                    while (right>left){

                        if (nums[right]!=nums[--right]){
                            break;

                        }
                    }
                    while (right>left){

                        if (nums[left]!=nums[++left]){
                            break;

                        }

                    }


                } else if (sum > 0) {
                    while (right>left){

                        if (nums[right]!=nums[--right]){
                            break;

                        }
                    }



                } else if (sum < 0) {


                    while (right>left){

                        if (nums[left]!=nums[++left]){
                            break;
                        }

                    }
                }


            }


        }


        return list;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int a[]={-1,-2,-3,4,1,3,0,3,-2,1,-2,2,-1,1,-5,4,-3};
        solution.threeSum(a);
    }
}
