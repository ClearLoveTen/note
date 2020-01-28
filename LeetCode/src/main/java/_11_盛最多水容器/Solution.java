package _11_盛最多水容器;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/3 23:07
 *
 */
public class Solution {
    public int maxArea(int[] height) {

        int left=0;
        int right=0;

        int sums=0;
        for (int i=0;i<height.length;i++){
            if (height[i]<left)
                continue;
            //更新左边最大的数
            left=height[i];
            for (int j=height.length-1;j>i;j--){

                if (height[j]>right){
                    //更新右边最大的值
                    right=height[j];
                    if (sum(height, i, j)>sums){

                        sums=sum(height, i, j);
                    }

                }


            }
            right=0;



        }

        return sums;

    }


    public int sum(int[] hight,int left,int right)
    {

       return  (right-left)*Math.min(hight[left],hight[right]);


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[]={1,8,6,2,5,4,8,3,7};
        solution.maxArea(a);
    }
}
