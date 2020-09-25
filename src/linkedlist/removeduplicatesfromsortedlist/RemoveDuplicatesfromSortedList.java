package linkedlist.removeduplicatesfromsortedlist;

import linkedlist.ListNode;

/**
 * @author Peixiao Zhao
 * @date 2020/9/25 18:20
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode pre = head;
        ListNode p = head.next;

        while (p != null){
            if (pre.val == p.val) {
                pre.next = p.next;
            }else{
                pre = p;
            }
            p = p.next;
        }

        return head;
    }
}
