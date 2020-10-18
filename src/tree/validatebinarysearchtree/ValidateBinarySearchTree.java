package tree.validatebinarysearchtree;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/18 14:33
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max){
        if (root == null) {
            return true;
        }
        if (root.val >= min || root.val <= max){
            return false;
        }
        return isValidBST(root.left, root.val, max) && isValidBST(root.right, min, root.val);
    }
}
