package warmup.page3.reverselinkedlist;

/**
 * @Author: Peixiao Zhao
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head.next;
        ListNode next = current.next;

        head.next = null;

        while (current != null) {
            current.next = head;

            head = current;
            current = next;

            if (next != null) {
                next = next.next;
            }
        }

        return head;
    }
}
