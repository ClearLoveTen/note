package 二叉树.线索化二叉树;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/15 15:27
 */
public class Tree {

    private int id;
    private String name;
    private Tree left;
    private Tree right;
    //1 代表叶子节点  0代表存储的实数  2代表存储的是 前驱节点。
    private int leftType;
    private int rightType;
}
