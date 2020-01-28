package 算法练习;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/9/14 17:36
 */
public class Solution {
        public boolean isPalindrome(int x) {

            Integer k = x;
            char[] chars = k.toString().toCharArray();

            if(chars[0]=='-'){
                return false;
            }




            if (chars.length % 2 == 0) {


                for (int i = 0, j = chars.length - 1; i!=j; j--, i++) {

                    if (chars[i] != chars[j])

                        return false;


                }


            } else {

                for (int i = 0, j = chars.length - 1;i+2!=j; j--, i++) {

                    if (chars[i] != chars[j])

                        return false;


                }

            }

            return true;
        }
    }

class Solution1 {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0 || s == null) {
            return 0;
        }
        if (s.equals(" ")) {


            return 1;

        }
        Set<Character> set = new HashSet<>();

        char[] chars = s.toCharArray();


        int size = 0;
        Character a;

        for (int i = 0; i < chars.length; i++) {

            a = chars[i];


            if (!set.add(chars[i])) {

                if (set.size() > size) {

                    size = set.size();
                }
                set.clear();

                set.add(a);

            }

            if (set.size() > size)

                size = set.size();
        }


        return size;
    }


public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


    ListNode lis = l1;
    int sum = 0;
    while (l1 != null && l2 != null) {

        sum = l1.val + l2.val + sum;
        l1.val = sum % 10;
        sum = sum / 10;

        if (l1.next == null) {
            l2 = l2.next;
            break;
        }
        l2 = l2.next;
        l1 = l1.next;
    }

    if (l1.next == null && l2 == null) {

        ListNode listNode = new ListNode(sum);
        l1.next = listNode;

    } else if (l1.next == null) {
        l1.next = l2;

        l2.val = l2.val + sum;


    } else if (l2 == null) {

        l1.val = l1.val + sum;

    }


    return lis;


}

public static void main(String[] args) {

    Solution Solution12 = new Solution();
    Solution12.isPalindrome(121);



}
}