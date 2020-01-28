package 算法练习;

import java.util.ArrayList;
import java.util.Stack;

public class 链表倒转 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        链表倒转 链表倒转 = new 链表倒转();
        链表倒转.printListFromTailToHead(listNode);


    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> list = new ArrayList();
        Stack<Integer> stack = new Stack();
        stack.push(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            stack.push(listNode.val);
        }

        while (!stack.empty()) {
            list.add(stack.pop());
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
        return list;
    }
}


class ListNode {
   int val;
   ListNode next = null;

    public ListNode() {
    }

    ListNode(int val) {
       this.val = val;
   }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}

