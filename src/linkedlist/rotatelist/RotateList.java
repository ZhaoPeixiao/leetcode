package linkedlist.rotatelist;

import linkedlist.ListNode;

/**
 * @author Peixiao Zhao
 * @date 2020/9/26 15:02
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            len ++;
            tail = tail.next;
        }

        tail.next = head;

        k %= len;

        for (int i = 1; i < len - k; i ++){
            head = head.next;
        }

        try{
            return head.next;
        }finally {
            head.next = null;
        }
    }
}
