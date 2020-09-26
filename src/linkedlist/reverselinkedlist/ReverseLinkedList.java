package linkedlist.reverselinkedlist;

import linkedlist.ListNode;

/**
 * @author Peixiao Zhao
 * @date 2020/9/26 14:57
 */
class Solution {
    public ListNode reverseList(ListNode head) {
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
