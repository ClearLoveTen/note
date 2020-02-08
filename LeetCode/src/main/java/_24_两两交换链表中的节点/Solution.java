package _24_两两交换链表中的节点;

import util.ListNode;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/14 13:31
 */
public class Solution {


    public ListNode swapPairs(ListNode head) {

        if (head==null||head.next==null){
            return head;
        }
       // 1->2->3->4->5


        ListNode listNode=head.next;

        head.next=listNode.next;
        listNode.next=head;


        ListNode listNode1=listNode;



        while (listNode1.next.next!=null&&listNode1.next.next.next!=null){

            listNode1=listNode1.next;
            listNode1.next=listNode1.next.next;







        }

        return listNode;
    }
}
