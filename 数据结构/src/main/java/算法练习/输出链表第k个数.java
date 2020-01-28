package 算法练习;

import java.util.Stack;

public class 输出链表第k个数 {
    public ListNode FindKthToTail(ListNode head, int k) {
        Stack<ListNode> stack = new Stack();
        if (head == null)
            return null;
        stack.push(head);
        while (head.next != null) {

            head = head.next;
            stack.push(head);
        }

        for (int i = 0; i < k - 1; i++) {

            stack.pop();

        }
        return stack.pop();


    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(listNode);
        输出链表第k个数 findKthToTail = new 输出链表第k个数();
       // System.out.println(listNode);
      //  System.out.println(findKthToTail.FindKthToTail(listNode, 2));


    }

}
