package 二叉树;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/15 12:32
 */
public class Tree {

    public int val;
    public Tree left;
    public Tree right;

    @Override
    public String toString() {
        return "Tree{" +
                "val=" + val +
                '}';
    }

    public Tree() {
    }

    public Tree(int val, Tree left, Tree right) {

        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Tree(int val) {

        this.val = val;
    }


    public static void main(String[] args) {


        Tree tree = new Tree(1);
        Tree tree1 = new Tree(2);
        Tree tree2 = new Tree(3);
        Tree tree3 = new Tree(4);
        Tree tree4 = new Tree(5);

        tree.left=tree1;
        tree.right=tree2;

        tree1.left=tree3;
        tree1.right=tree4;

        //树遍历 树遍历 = new 树遍历();
/*
         1
      2     3
   4     5            */

      //  System.out.println(树遍历.before(tree).toString());
       // System.out.println(树遍历.midele(tree).toString());
        //System.out.println(树遍历.after(tree).toString());



        //二叉树查找 二叉树查找 = new 二叉树查找();
        //System.out.println(二叉树查找.before(tree, 0));
       // System.out.println(二叉树查找.middle(tree, 7));
        //System.out.println(二叉树查找.after(tree, 7));


        二叉树删除节点 二叉树删除节点 = new 二叉树删除节点();
        System.out.println(二叉树删除节点.deleteTree(tree, 3));


    }
}
