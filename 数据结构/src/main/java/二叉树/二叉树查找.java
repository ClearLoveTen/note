package 二叉树;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/15 12:57
 */
public class 二叉树查找 {


    /**
     * 前序列查找
     *
     * @param tree
     * @param num
     * @return
     */
    public Tree before(Tree tree, int num) {


        if (tree.val == num) {


            return tree;
        }

        //加一个中间节点，接受递归的参数，进行判断。
        Tree tree1=null;
        if (tree.left != null) {

            tree1= before(tree.left, num);
        }
        if (tree1!=null){

            return tree1;
        }

        if (tree.right != null) {
            tree1=before(tree.right, num);
        }

        return tree1;
    }


 /**
     * 中序列查找
     *
     * @param tree
     * @param num
     * @return
     */
    public Tree middle(Tree tree, int num) {




        //加一个中间节点，接受递归的参数，进行判断。
        Tree tree1=null;
        if (tree.left != null) {

            tree1= middle(tree.left, num);
        }


        if (tree.val == num) {


            return tree;
        }


        if (tree1!=null){

            return tree1;
        }

        if (tree.right != null) {
            tree1=middle(tree.right, num);
        }

        return tree1;
    }
/**
     * 后序列查找
     *
     * @param tree
     * @param num
     * @return
     */
    public Tree after(Tree tree, int num) {




        //加一个中间节点，接受递归的参数，进行判断。
        Tree tree1=null;
        if (tree.left != null) {

            tree1= after(tree.left, num);
        }


        if (tree1!=null){

            return tree1;
        }

        if (tree.right != null) {
            tree1=after(tree.right, num);
        }

        if (tree.val == num) {


            return tree;
        }


        return tree1;
    }


}
