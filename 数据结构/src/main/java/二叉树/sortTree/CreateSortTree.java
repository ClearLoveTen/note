package 二叉树.sortTree;

import 二叉树.Tree;
import 二叉树.树遍历;

/**
 *
 * 顺序存储二叉树中序遍历回自动排序
 *
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/15 16:04
 */
public class CreateSortTree {

    public static void main(String[] args) {


        Tree tree=new Tree(6);


        SortTree sortTree = new SortTree(tree);
        sortTree.addNode(new Tree(7));
        sortTree.addNode(new Tree(2));
        sortTree.addNode(new Tree(4));
        sortTree.addNode(new Tree(4));
        sortTree.addNode(new Tree(4));
        sortTree.addNode(new Tree(9));
        sortTree.addNode(new Tree(5));
        sortTree.addNode(new Tree(6));
        树遍历 树遍历 = new 树遍历();
        System.out.println(树遍历.midele(sortTree.getRoot()).toString());


    }
}
