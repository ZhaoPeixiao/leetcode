package linkedlist.deletenodeinalinkedlist;

import linkedlist.ListNode;

/**
 * @author Peixiao Zhao
 * @date 2020/9/24 22:22
 */
class Solution {
    public void deleteNode(ListNode node) {
        if (node == null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
