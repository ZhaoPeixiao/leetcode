package page1.convertbinarynumberinalinkedlisttointeger;

/**
 * @Author: Peixiao Zhao
 */

/**
 * Definition for singly-linked list.
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
    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null){
            stringBuilder.append(node.val);
            node = node.next;
        }
        return Integer.parseInt(stringBuilder.toString(), 2);
    }
}
