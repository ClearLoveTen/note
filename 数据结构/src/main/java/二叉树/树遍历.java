package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/15 12:32
 */
public class 树遍历 {


    List<Integer> vals=new ArrayList<>();

    /**
     * 前序遍历
     * @param tree
     * @return
     */
    public   List<Integer> before(Tree tree){

        vals.add(tree.val);

        if (tree.left!=null){

            before(tree.left);

        }
        if (tree.right!=null) {

            before(tree.right);

        }
        return vals;

    };

    /**
     * 中序遍历
     * @param tree
     * @return
     */
    public List<Integer> midele(Tree tree){



        if (tree.left!=null){

            midele(tree.left);

        }
        vals.add(tree.val);
        if (tree.right!=null) {

            midele(tree.right);

        }
        return vals;

    };
    /**
     * 后序遍历
     * @param tree
     * @return
     */
    public List<Integer> after(Tree tree){



        if (tree.left!=null){

            after(tree.left);

        }

        if (tree.right!=null) {

            after(tree.right);

        }
        vals.add(tree.val);
        return vals;

    }







}
