package _51_n皇后;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();

        List<List<String>> lists = solution.solveNQueens(4);


        System.out.println(lists.toString());


    }


    List<List<String>> lists = new ArrayList<>();
    //当前为几皇后
    int n;
    //当前添加的数组
    int sum[];
    //当前已经添加了0 个元素
    int s = 0;




    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        sum = new int[n];

        gogo();
        return lists;
    }

    public void gogo() {
        if (s==n){
            //构建数组存放进去
            List<String> strings = new ArrayList<>();
            for (int i : sum) {

                StringBuilder stringBuilder =new StringBuilder();
                for (int j=0;j<n;j++){
                    if (i==j){
                        stringBuilder.append("Q");
                    }else {
                        stringBuilder.append(".");
                    }
                }

                strings.add(stringBuilder.toString());
            }
            lists.add(strings);
        }
        for (int i = 0; i < n; i++) {


            if (checkOut(i)) {
                sum[s] = i;
                s++;
                gogo();
                s--;
            }

        }
    }

        public boolean checkOut(Integer t) {


        for (int i=0;i<s;i++){
            //判断是否在同一列
            if (sum[i]==t){
                return false;
            }
            //计算当前 / \斜

            if (Math.abs(sum[i]-t)==Math.abs(s-i)){
                return false;
            }
        }

        return true;
    }

}