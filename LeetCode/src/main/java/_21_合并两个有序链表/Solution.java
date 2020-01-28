package _21_合并两个有序链表;

import LeetCode.util.ListNode;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/4 19:36
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }

        ListNode listNode = null;


        //向l1上合并
        if (l1.val > l2.val) {
            listNode = l2;
            l2 = l2.next;
        } else {
            listNode = l1;
            l1 = l1.next;
        }


        ListNode node = listNode;

        if (l1 != null && l2 != null) {

            while (true) {

                if (l1.val > l2.val) {

                    node.next = l2;
                    node = node.next;
                    if (l2.next != null) {
                        l2 = l2.next;
                    } else {
                        break;
                    }

                } else {

                    node.next = l1;
                    node = node.next;
                    if (l1.next != null) {
                        l1 = l1.next;
                    } else {
                        break;
                    }
                }

            }
        }else {



        }
        if (l1.next==null){
            node.next=l2;
        }else {
            node.next=l1;
        }
        return listNode;
    }
}
