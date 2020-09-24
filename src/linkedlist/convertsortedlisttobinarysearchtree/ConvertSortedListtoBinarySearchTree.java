package linkedlist.convertsortedlisttobinarysearchtree;

import linkedlist.ListNode;
import linkedlist.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/9/24 22:14
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null){
            return new TreeNode(head.val);
        }

        ListNode mid = cutAtMid(head);
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);

        return root;

    }

    ListNode cutAtMid(ListNode head){
        if (head == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode pslow = head;

        while (fast != null && fast.next != null) {
            pslow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pslow.next = null;
        return slow;
    }

}
