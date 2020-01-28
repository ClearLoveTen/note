package 二叉树.红黑树;

import java.util.Scanner;

/**
 * ClassName: TestRBTree
 * Description:
 * date: 2020/1/12 16:07
 *
 * @author 巍巍老师
 * @since 1.0.0
 */
public class TestRBTree {
    public static void main(String[] args) {
        RBTree<String, Object> rbt = new RBTree();


        //测试输入：ijkgefhdabc
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入key:");
            String key = sc.next();

            rbt.insert(key, null);
            TreeOperation.show(rbt.getRoot());
        }
    }
}