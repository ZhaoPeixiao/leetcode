package tree.pathsum;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/17 9:55
 */
class Solution {
    boolean hasPath;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        hasPath = false;
        helper(root, 0, sum);
        return hasPath;
    }

    public void helper(TreeNode node, int cur, int sum){
        cur += node.val;

        boolean isLeaf = (node.left == null) && (node.right == null);

        if (cur == sum && isLeaf){
            hasPath = true;
        }
        if (node.left != null){
            helper(node.left, cur, sum);
        }
        if (node.right != null) {
            helper(node.right, cur, sum);
        }

        cur -= node.val;
    }
}
