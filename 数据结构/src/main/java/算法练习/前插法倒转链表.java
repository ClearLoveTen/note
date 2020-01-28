package 算法练习;

public class 前插法倒转链表 {


    public static void main(String[] args) {




        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(listNode);
        ListNode listNode4 = ReverseList(listNode);


    }
    public static ListNode ReverseList(ListNode head) {
        //输入的链表
        ListNode head1=head;
        //中间的节点
        ListNode head2;

        ListNode head3;
        //为空，直接退出
        if(head1==null){

            return head1;
        }

        head2=head1;
        head1=head1.next;
        head3=head2;
        head3.next=null;

        //插入第一个节点了

        while(head1!=null){
            head2=head1;
            head1=head1.next;

            head2.next=head3;
            head3=head2;
        }

        return head3;

    }
}
