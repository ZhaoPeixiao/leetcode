package tree.maximumdepthofbinarytree;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/16 18:00
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int nLeft = maxDepth(root.left);
        int nRight = maxDepth(root.right);

        return nLeft > nRight? (nLeft + 1) : (nRight + 1);
    }
}
