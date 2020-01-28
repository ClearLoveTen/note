package 算法练习;



/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/16 11:48
 */
public class 判断数组是否为二叉搜索树后续遍历结果 {


    class Tree {
        public int val;
        public Tree left;
        public Tree right;

        public Tree(int val) {
            this.val = val;
        }
    }

    int[] ints;
    int k = 0;

    /**
     * 根据该数组重构二叉树
     * 后序遍历二叉树 判断是否相等
     *
     * @param sequence
     * @return
     */
    public boolean VerifySquenceOfBST(int[] sequence) {

        //重构搜索二叉树

        ints = new int[sequence.length];


        Tree tree = new Tree(sequence[0]);

        for (int i = 1; i < sequence.length; i++) {

            addTree(tree, sequence[i]);
        }
        //后续遍历二叉树
        afterTree(tree);

        for (int i = 0; i < ints.length; i++) {

            if (sequence[i] != ints[i]) {
                return false;
            }
        }

        return true;
    }


    public void addTree(Tree tree, int num) {


        if (tree == null) {
            tree.val = num;
            return;
        }

        if (num > tree.val) {

            if (tree.right == null) {
                Tree tree1 = new Tree(num);

                tree.right = tree1;

            } else {


                addTree(tree.right, num);


            }

        } else {


            if (tree.left == null) {
                Tree tree1 = new Tree(num);

                tree.left = tree1;

            } else {


                addTree(tree.left, num);


            }


        }


    }

    public void afterTree(Tree tree) {


        if (tree.left != null) {

            afterTree(tree.left);
        }
        if (tree.right != null) {

            afterTree(tree.right);
        }


        ints[k++] = tree.val;


    }


    public static void main(String[] args) {
        判断数组是否为二叉搜索树后续遍历结果 判断数组是否为二叉搜索树后续遍历结果 = new 判断数组是否为二叉搜索树后续遍历结果();
        int []a={4,8,6,12,16,14,10};
        判断数组是否为二叉搜索树后续遍历结果.VerifySquenceOfBST(a);
    }
}
