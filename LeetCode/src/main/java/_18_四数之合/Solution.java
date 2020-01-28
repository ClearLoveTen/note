package _18_四数之合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/4 17:10
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        //List<List<Integer>> list=new ArrayList<>();
        TreeSet<List<Integer>> list = new TreeSet<>(
                (o1, o2) -> {
                    for (int i = 0; i < o1.size(); i++) {

                        if (o1.get(i) < o2.get(i)) {

                            return -1;
                        }
                        if (o1.get(i) > o2.get(i)) {

                            return 1;
                        }


                    }


                    return 0;
                });


        int num = 0;
        for (int i = 0; i < nums.length - 3; i++) {

            for (int j = i + 1; j < nums.length - 2; j++) {

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    num = nums[i] + nums[j] + nums[right] + nums[left];
                    if (num == target) {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(nums[i]);
                        arrayList.add(nums[j]);
                        arrayList.add(nums[left]);
                        arrayList.add(nums[right]);
                        list.add(arrayList);
                        left++;
                        right--;
                    } else if (num > target) {

                        right--;

                    } else {

                        left++;
                    }


                }


            }


        }

        List<List<Integer>> lists = new ArrayList(list);
        return lists;

    }

}

