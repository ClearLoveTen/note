package 算法练习;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/19 12:31
 */
public class 层次遍历 {
    class TreeNode {


        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }



        ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();

            LinkedList<TreeNode> linklist = new LinkedList<TreeNode>();

            linklist.addLast(pRoot);

            if (pRoot!=null){


                ArrayList<Integer> objects = new ArrayList<>();

                objects.add(pRoot.val);


            }



            return null;
        }

    }
}
