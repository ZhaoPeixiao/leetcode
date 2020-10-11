package sort.insertionsortlist;

/**
 * @author Peixiao Zhao
 * @date 2020/10/11 15:19
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
    public ListNode insertionSortList(ListNode head) {
        if(head == null) {
            return head;
        }

        ListNode runner = head;
        while(runner.next != null) {
            if(runner.val > runner.next.val) {
                //get the next node
                ListNode node = runner.next;
                //set the next node of current node
                runner.next = runner.next.next;

                //find an insert position for node
                ListNode search = head;
                ListNode parent = null;
                while(search.val < node.val) {
                    parent = search;
                    search = search.next;
                }

                node.next = search;
                //if parent is null then insertion position is head
                if(parent == null) {
                    head = node;
                } else {
                    parent.next = node;
                }
            } else {
                runner = runner.next;
            }
        }
        return head;
    }
}
