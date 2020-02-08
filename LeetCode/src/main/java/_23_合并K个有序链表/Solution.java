package _23_合并K个有序链表;

import util.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/14 12:33
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        List<Integer> list = new LinkedList<>();

        for (ListNode listNode : lists) {


            while (listNode != null) {


                list.add(listNode.val);

                if (listNode.next != null) {
                    listNode = listNode.next;

                } else {

                    break;
                }
            }

        }

        list.sort((o1, o2) -> {
            if (o1 == o2) {

                return 0;
            } else if (o1 > o2) {
                return -1;
            } else {
                return 1;
            }
        });
        ListNode listNode = null;
        if (!list.isEmpty()) {
            listNode = new ListNode(list.remove(0));
        } else {

            return null;
        }

        ListNode listNode1 = listNode;

        while (!list.isEmpty()) {

            listNode1.next = new ListNode(list.remove(0));
            listNode1 = listNode1.next;


        }


        return listNode;


    }
}
