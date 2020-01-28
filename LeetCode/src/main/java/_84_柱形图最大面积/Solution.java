package _84_柱形图最大面积;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/2 16:36
 */
public class Solution {


    /**
     * 分析得出结论 肯定是以某一个为顶部为最大值进行计算
     * <p>
     * 从一依次展开计算
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {


        int max = 0;

        for (int i = 0; i < heights.length; i++) {

            max = Math.max(max, count(heights, i));

        }


        return max;

    }


    public int count(int[] heights, int num) {

        int sum = 1;
        //向左寻找最小的

        for (int i = num - 1; i >= 0; i--) {

            if (heights[i] < heights[num]) {

                break;

            } else {
                sum++;
            }


        }


        //向右寻找

        for (int i = num + 1; i < heights.length; i++) {

            if (heights[i] < heights[num]) {
                break;
            } else {
                sum++;
            }


        }

        return sum * heights[num];

    }


}
