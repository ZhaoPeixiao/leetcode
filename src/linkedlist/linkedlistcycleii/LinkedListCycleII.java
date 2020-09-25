package linkedlist.linkedlistcycleii;

import linkedlist.ListNode;

/**
 * @author Peixiao Zhao
 * @date 2020/9/25 18:04
 */
class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        boolean meet = false;
        int len = 0;

        while (fast != null){
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            if (slow == fast){
                if (meet){
                    break;
                }
                meet = true;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (meet){
                len ++;
            }
        }

        if (meet){
            slow = head;
            fast = head;

            for (int i = 0; i < len; i ++){
                fast = fast.next;
            }

            while (slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

        return null;
    }
}
