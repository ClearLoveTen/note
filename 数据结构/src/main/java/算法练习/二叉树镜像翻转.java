package 算法练习;

public class 二叉树镜像翻转 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        public void Mirror(TreeNode root) {
            if (root.left!= null) {

                Mirror(root.left);
            }
            if (root.right != null) {

                Mirror(root.right);
            }

            TreeNode s = root.right;
            root.right = root.left;
            root.left = s;


        }
    }
}