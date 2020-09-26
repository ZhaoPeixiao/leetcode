package linkedlist.sortlist;

import linkedlist.ListNode;

/**
 * @author Peixiao Zhao
 * @date 2020/9/26 15:05
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }

        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode h2 = slow.next;
        slow.next = null;

        return mergeSort(sortList(head), sortList(h2));
    }

    public ListNode mergeSort(ListNode l1, ListNode l2){
        ListNode rt = new ListNode(0);
        ListNode h = rt;

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                rt.next = l1;
                l1 = l1.next;
            }
            else {
                rt.next = l2;
                l2 =l2.next;
            }
            rt = rt.next;
        }

        if (l1 != null){
            rt.next = l1;
        }
        else{
            rt.next = l2;
        }

        return h.next;
    }

}
