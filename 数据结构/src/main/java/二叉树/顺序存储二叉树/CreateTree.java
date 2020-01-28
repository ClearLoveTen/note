package 二叉树.顺序存储二叉树;

import 二叉树.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/15 14:02
 */
public class CreateTree {


    /**
     * 第N个元素的左子节点为2*n+1 右子节点为2*n+2
     * 父亲节点为 （n-1）/2
     *
     * @param a
     * @return
     */

    public Tree createTree(int[] a) {


        Tree tree = new Tree();

        return createTree(a, a.length, tree, 0);
    }

    private Tree createTree(int[] a, int lenght, Tree tree, int id) {
        //遍历当前的树
        tree.val = a[id];

        if (2 * id + 1 < lenght) {

            Tree tree1 = new Tree();
            createTree(a, lenght, tree.left = tree1, 2 * id + 1);

        }
        if (2 * id + 2 < lenght) {

            Tree tree1 = new Tree();
            createTree(a, lenght, tree.right = tree1, 2 * id + 2);
        }


        return tree;


    }

    /**
     * 顺序存储二叉树层次遍历
     * @param tree
     * @return
     */
    public ArrayList<Integer> level(Tree tree) {
        ArrayList<Integer> arrayLi = new ArrayList<>();

        Queue<Tree> queue = new LinkedList<>();
        if (tree != null) {

            queue.offer(tree);


        }

        while (!queue.isEmpty()) {

            Tree poll = queue.poll();
            arrayLi.add(poll.val);

            if (poll.left != null) {

                queue.offer(poll.left);

            }
            if (poll.right != null) {

                queue.offer(poll.right);

            }


        }
        return arrayLi;

    }


}
