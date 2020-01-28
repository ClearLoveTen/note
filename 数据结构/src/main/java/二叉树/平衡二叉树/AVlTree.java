package 二叉树.平衡二叉树;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/15 17:33
 */
public class AVlTree {


    private int val;
    private AVlTree left;
    private AVlTree right;


    //返回左子树的高度
    public int getleftLenght(){


        return this.left.getLength();
    }

   //返回右子树的高度

    public int getRighLenght(){

        return this.right.getLength();
    }
    public int  getLength(){

        return Math.max((this.left==null)?0:this.left.getLength(),
                (this.right==null)?0:this.right.getLength())+1;
    }

    @Override
    public String toString() {
        return "AVlTree{" +
                "val=" + val +
                '}';
    }

    public int getVal() {

        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }


    public void setLeft(AVlTree left) {
        this.left = left;
    }

    public void setRight(AVlTree right) {
        this.right = right;
    }

    public AVlTree(int val, AVlTree left, AVlTree right) {

        this.val = val;
        this.left = left;
        this.right = right;
    }

    public AVlTree(int val) {

        this.val = val;
    }
}


