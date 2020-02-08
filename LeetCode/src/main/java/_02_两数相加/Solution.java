package _02_两数相加;

import util.ListNode;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/16 15:02
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode listNode=l1;
        int num=0;
        int sum=0;
        while (l1!=null&&l2!=null){

            sum=l1.val=l1.val+num;
            num=sum/10;
            l1.val=sum%10;
            if (l1.next==null||l2.next==null){

                break;
            }
        }

        if (l1.next==null){

            l1.next=l2.next;

            while (num!=0){
                sum=l2.val+num;
                l2.val=num%10;
                num=sum/10;
            }








    }return null;
}}

