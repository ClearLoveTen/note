package 二叉树;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/15 13:27
 */
public class 二叉树删除节点 {


    /**
     * 如果节点为叶子节点，删除该叶子，如果为树，则删除该树。
     * 因为二叉树是单向的所以不能自身删除。
     * @param tree
     * @param val
     * @return
     */
    public boolean  deleteTree(Tree tree,int val){



        boolean bo=false;
        if (tree.left!=null){
            //如果左边节点为空
            if (tree.left.val==val){

                tree.left=null;

                return true;
            }

            bo=deleteTree(tree.left,val);

        }

        if (bo){
            return true;
        }
        if (tree.right!=null){
            //如果右边节点为空
            if (tree.right.val==val){

                tree.right=null;

                return true;
            }


            bo=deleteTree(tree.right,val);
        }



        return bo;

    }


}
