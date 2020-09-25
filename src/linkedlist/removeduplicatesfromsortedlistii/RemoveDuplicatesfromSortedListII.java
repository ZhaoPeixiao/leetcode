package linkedlist.removeduplicatesfromsortedlistii;

import linkedlist.ListNode;

/**
 * @author Peixiao Zhao
 * @date 2020/9/25 18:24
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        int val = head.val;
        ListNode node = head;
        boolean killme = false;

        while (node.next != null && node.next.val == val) {
            node = node.next;
            killme = true;
        }

        if (killme) {
            head = deleteDuplicates(node.next);
        } else {
            head.next = deleteDuplicates(node.next);
        }

        return head;
    }
}
