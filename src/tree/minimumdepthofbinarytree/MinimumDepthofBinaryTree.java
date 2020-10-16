package tree.minimumdepthofbinarytree;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/16 18:01
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        } else if (root.left != null && root.right == null) {
            return minDepth(root.left) + 1;
        }else if (root.left == null && root.right != null){
            return minDepth(root.right) + 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
