package _55_跳跃游戏;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/4 18:29
 */
public class Solution {

    public boolean canJump(int[] nums) {


        for (int i=0;i<nums.length-1;i++){

            if (nums[i]==0){
                //判断已经走过的地方是否可以越过当前位置

                boolean bo=false;

                for (int j=i-1;j>=0;j--){

                    if (i-j<nums[j]){

                        bo=true;
                        break;
                    }

                }


                if (bo==false){

                    return false;
                }
            }

        }


        return true;

    }


}
