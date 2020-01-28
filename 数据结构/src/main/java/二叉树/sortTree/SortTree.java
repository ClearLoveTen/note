package 二叉树.sortTree;

import 二叉树.Tree;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/15 16:08
 */
public class SortTree {


    private Tree root;

    public Tree getRoot() {
        return root;
    }

    public SortTree(Tree root) {
        this.root = root;
    }

    public void addNode(Tree node) {

        if (root == null) {

            this.root = node;
        } else {
            addNode(root, node);
        }


    }

    /**
     * 删除一个节点
     * 分为三种情况
     * 1、删除的为叶子节点
     * 2、删除只有一棵子树的节点
     * 3、删除有两颗子树的节点
     *
     * @param node
     * @return
     */
    public boolean delete(Tree node) {

        Tree tree = root;
        while (tree.right==node||tree.left==node) {
            if (tree.val < node.val) {
                tree = tree.right;
            } else {

                tree = tree.left;
            }
        }


        //找到了它的父节点了


        return  true;



    }

    private void addNode(Tree root, Tree node) {


        if (root.val < node.val) {

            if (root.right != null) {
                addNode(root.right, node);

            } else {

                root.right = node;

            }

        } else {


            if (root.left != null) {
                addNode(root.left, node);

            } else {

                root.left = node;

            }

        }


    }


}
