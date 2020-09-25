package linkedlist.palindromelinkedlist;

import linkedlist.ListNode;

/**
 * @author Peixiao Zhao
 * @date 2020/9/25 18:15
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode tail = reverseList(slow);
        while (head != slow){
            if (head.val != tail.val){
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head){
        if (head == null){
            return null;
        }

        if (head.next == null){
            return head;
        }

        ListNode tail = head.next;
        ListNode reversed = reverseList(head.next);

        tail.next = head;
        head.next = null;

        return reversed;
    }
}
