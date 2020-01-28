package 算法练习;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/12 20:19
 */
public class 排序 {


    class Node {

        int val;

        Node next;

        public Node(int val) {
            this.val = val;
        }
    }


    /**
     * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

            ArrayList<Integer> arrayList=new ArrayList<>();

        if (listNode==null){
            return null;
        }

        Stack<Integer> stack=new Stack<>();

        stack.push(listNode.val);

        while(listNode.next!=null){

            listNode=listNode.next;
            stack.push(listNode.val);
        }


        while (!stack.isEmpty()){

           arrayList.add(stack.pop());



        }
        return arrayList;
    }
    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {

        int last=0;
        int first=0;

        if (str.indexOf(" ")==0){

            first =1;
        }
        if(str.lastIndexOf(" ")==str.length()-1){

            last=1;

        }

        String[] split = str.toString().split(" ");



        StringBuilder stringBuilder = new StringBuilder();


        for (int i=0;i<split.length-1;i++){

        stringBuilder.append(split[i]);
        stringBuilder.append("%20");

        }



        stringBuilder.append(split[split.length-1]);
        if (last==1){

            stringBuilder.append(" ");
        }
        if (first==1){


            stringBuilder.insert(0," ");
        }

        return stringBuilder.toString();

    }

    /**
     * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
     * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     *
     * @param pHead
     * @return
     */

    public ListNode deleteDuplication(ListNode pHead)

    {
        //保存第一个节点
        ListNode node = pHead;

        //第一个重复了
        if (node.next.val==node.val){


        }


        while (node.next != null) {

            if (node.val==node.next.val){
                node.next=node.next.next;
                while (node.val==node.next.val){

                    node.next=node.next.next;
                    node=node.next;

                }





            }else {

                node=node.next;


            }


        }
        return pHead;

    }

    /**
     * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
     *
     * @param pHead //实现思路，长短指针
     * @return
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {

        //计数
        int num = 0;

        //后指针
        ListNode after = pHead;


        //前指针
        ListNode befor = pHead;


        while (befor.next != null) {
            num++;
            befor = befor.next;


            after = pHead;
            for (int i = 1; i < num; i++) {

                if (after.equals(befor)) {

                    return after;


                }

                after = after.next;


            }


        }

        return null;
    }

    /**
     * (圆圈中最后剩下的数)
     * node.next=node.next.next;删除节点
     *
     * @param n
     * @param m
     * @return
     */
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0) {
            return -1;
        }

        Node node = new Node(0);

        Node node1 = node;

        for (int i = 1; i < n; i++) {
            Node node2 = new Node(i);

            node1.next = node2;
            node1 = node1.next;

        }
        node1.next = node;


        while (node.next != node) {

            for (int i = 1; i < m - 1; i++) {


                node = node.next;
            }

            node.next = node.next.next;
            node = node.next;


        }


        return node.val;

    }


    /**
     * 是“I am a student.”。
     *
     * @param str
     * @return
     */
    public String ReverseSentence(String str) {

        if (str.equals(" ")) {
            return str;
        }
        String[] split = str.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = split.length - 1; i >= 0; i--) {


            stringBuilder.append(split[i] + " ");
        }


        return stringBuilder.toString();

    }

    /**
     * 统计一个数字在排序数组中出现的次数
     *
     * @param array
     * @param k
     * @return
     */
    public int GetNumberOfK(int[] array, int k) {
        int num = 0;

        for (int i = 0; i < array.length; i++) {

            if (k == array[i]) {

                num++;

                for (int j = i + 1; j < array.length; j++) {

                    if (array[j] == k) {
                        num++;
                    } else {

                        return num;
                    }


                }

                return num;

            }


        }

        return 0;
    }

    /**
     * 两个链表找到公共节点                输入两个链表，找出它们的第一个公共结点。 思路长短指针，Set集合。
     *
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        Set<ListNode> set = new HashSet();

        while (pHead1 != null) {

            set.add(pHead1);

            pHead1 = pHead1.next;

        }

        ListNode listNode;

        while (pHead2 != null) {

            listNode = pHead2;

            if (set.add(pHead2)) {

                pHead2 = pHead2.next;
            } else {

                return listNode;
            }


        }


        return null;
    }


    public int FirstNotRepeatingChar(String str) {

        char[] chars = str.toCharArray();


        for (int i = 0; i < chars.length; i++) {


            for (int j = 0; j < chars.length; j++) {

                if (i == j) {

                    continue;
                }

                if (chars[i] == chars[j]) {

                    break;
                }
                if (j == chars.length - 1) {

                    return i;
                }

            }


        }


        return -1;
    }


    public static void main(String[] args) {
        排序 排序 = new 排序();
       排序.replaceSpace(new StringBuffer(" helloworld"));
    }
}