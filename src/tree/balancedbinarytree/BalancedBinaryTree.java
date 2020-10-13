package tree.balancedbinarytree;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/13 14:26
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return Math.abs(height(root.left) - height(root.right)) <= 1 &&
                isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode node){
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
