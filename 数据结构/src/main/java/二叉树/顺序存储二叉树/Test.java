package 二叉树.顺序存储二叉树;

import 二叉树.Tree;
import 二叉树.树遍历;

import java.util.ArrayList;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/15 13:55
 */
public class Test {
    public static void main(String[] args) {

  /*      Tree tree1 = new Tree(1);
        Tree tree2 = new Tree(2);
        Tree tree3 = new Tree(3);
        Tree tree4 = new Tree(4);
        Tree tree5 = new Tree(5);
        Tree tree6 = new Tree(6);
        Tree tree7 = new Tree(7);
        Tree tree8 = new Tree(8);
        Tree tree9 = new Tree(9);
        Tree tree10 = new Tree(10);
        Tree tree11 = new Tree(11);
        Tree tree12 = new Tree(12);
        tree1.left=tree2;
        tree1.right=tree3;
        tree2.left=tree4;
        tree2.right=tree5;
        tree3.left=tree6;
        tree3.right=tree7;
        tree4.left=tree8;
        tree4.right=tree9;
        tree5.left=tree10;
        tree5.right=tree11;
        tree6.left=tree12;*/


        CreateTree createTree = new CreateTree();

        /**
         * 构建顺序存储二叉树
         */
        int []a={1,2,3,4,5};
        Tree tree = createTree.createTree(a);
        System.out.println(tree);

        /**
         * 前序遍历
         */
        树遍历 树遍历 = new 树遍历();
        System.out.println(树遍历.before(tree));
        /**
         * 顺序存储二叉树层次遍历
         */
        ArrayList<Integer> level = createTree.level(tree);

        for (Integer integer : level) {
            System.out.println(integer);

        }


    }

}
