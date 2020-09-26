package linkedlist.removenthnodefromendoflist;

import linkedlist.ListNode;

/**
 * @author Peixiao Zhao
 * @date 2020/9/26 14:53
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null){
            return null;
        }

        ListNode p = head;
        ListNode q = head;

        for (int i = 0; i < n; i ++){
            p = p.next;
            if (p == null){
                return head.next;
            }
        }

        while (p.next != null){
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;

        return head;
    }
}
