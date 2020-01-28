package _41_缺失的正整数;

import java.util.HashSet;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/18 0:32
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for (int num : nums) {

            set.add(num);

        }

        for (int i=1;i<nums.length+2;i++){

            if (!set.contains(i)){
                return i;
            }
        }

        return 1;
    }
}
