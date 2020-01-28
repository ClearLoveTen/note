package 数字分解;

import java.util.*;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/16 18:39
 */
public class Solution {

    //需要分解的数字
    int num;

    //辅助参数，容器中当前存储的数据和
    int sum = 0;

    List<List<Integer>> lists = new ArrayList<>();


    public Solution(int num) {
        this.num = num;
    }


    public void gogo() {

        //查出所有的可能性结果 存储在TreeSet 集合中
        chonchong(1, new LinkedList<Integer>());

        //对lists集合进行排序，保证打印结果有序
        //3 2 1
        //3 3
        //4 1
        //5
        lists.sort((o1, o2) -> {
            if (o1.size()<o2.size()){
                return -1;
            }
            if (o1.size() > o2.size()) {
                return 1;
            }

            for (int i=0;i<o1.size();i++){
                if (o1.get(i)>o2.get(i)){
                    return 1;
                }
                if (o1.get(i)<o2.get(i)){
                    return -1;
                }

            }
            return 0;
        });
        //打印
        print();

    }

    /**
     * 输出打印
     */
    private void print() {
        Iterator<List<Integer>> iterator = lists.iterator();
        System.out.println("总共有"+lists.size()+"种可能性!");
        while (iterator.hasNext()) {
            List<Integer> next = iterator.next();
            System.out.print(num + "=");
            System.out.print(next.get(0));
            for (int i = 1; i < next.size(); i++) {
                System.out.print("+" + next.get(i));
            }
            System.out.println();
        }

        System.out.println("总共有"+lists.size()+"种可能性!");
    }

    /**
     * 核心方法，递归加回溯
     *
     * @param n    用于代码优化，和不往lists容器中添加重复的可能性进去，保证了数据从小到大依次排列。
     * @param list 存储当前已经添加的数的一个容器
     */
    public void chonchong(int n, LinkedList<Integer> list) {

        for (int i = n; i <= num; i++) {
            sum = sum + i;
            list.add(i);
            if (sum == num) {
                lists.add(new ArrayList<>(list));
                list.removeLast();
                sum = sum - i;
                return;
            }
            if (sum < num) {
                chonchong(i, list);

                list.removeLast();
                sum = sum - i;
                continue;
            }
            if (sum > num) {

                list.removeLast();
                sum = sum - i;
                return;
            }
        }

    }

    public static void main(String[] args) {
        long time = new Date().getTime();
        new Solution(40).gogo();
        long time2 = new Date().getTime();
        System.out.println("代码执行用时"+(time2 - time)+"毫秒");
        System.out.println("代码执行用时"+(time2 - time)/1000+"秒");

    }

}
