package _19_删除链表倒数K个元素;

import LeetCode.util.ListNode;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/4 17:45
 */
public class Solution {

   public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode listNode=head;

        ListNode pro=head;


        //头针指向第n 个元素
        for (int i=1;i<n;i++){

            pro=pro.next;

        }
        if (pro.next!=null){
            pro=pro.next;
        }else {

            if (listNode.next!=null){
            head=head.next;
            return head;
            }else {
                head=null;
                return head;
            }

        }

        while (pro.next!=null){
            listNode=listNode.next;
            pro=pro.next;
        }

        listNode.next=listNode.next.next;


       return head;
   }

}
