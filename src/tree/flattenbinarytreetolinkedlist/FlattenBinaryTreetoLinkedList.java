package tree.flattenbinarytreetolinkedlist;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/15 17:30
 */
class Solution {
    TreeNode prev;

    public void preorder(TreeNode root) {
        if (root == null)
            return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        // root
        if (prev != null) {
            prev.right = root;
            prev.left = null;
        }
        prev = root;
        preorder(left);
        preorder(right);
    }


    public void flatten(TreeNode root) {
        prev = null;
        preorder(root);
    }
}
