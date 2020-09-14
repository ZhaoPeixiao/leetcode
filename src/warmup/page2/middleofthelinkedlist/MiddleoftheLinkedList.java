package warmup.page2.middleofthelinkedlist;

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
    public ListNode middleNode(ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while (pointer1 != null && pointer1.next != null){
            pointer1 = pointer1.next.next;
            pointer2 = pointer2.next;
        }
        return pointer2;
    }
}
