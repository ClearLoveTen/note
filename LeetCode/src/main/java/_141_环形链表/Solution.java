package _141_环形链表;

import LeetCode.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/2 16:15
 */
public class Solution {
    public boolean hasCycle(ListNode head) {


        if (head==null||head.next==null){
            return false;
        }

        Set<ListNode> listNodes= new HashSet<>();



        listNodes.add(head);

        while (head.next!=null){


            head=head.next;

            if (!listNodes.add(head)){


                return true;
            }

        }

        //双指针 和 HashSet

return false;
    }
}
