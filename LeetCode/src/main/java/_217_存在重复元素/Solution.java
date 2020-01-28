package _217_存在重复元素;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/28 12:51
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例 1:
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>(nums.length);

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
