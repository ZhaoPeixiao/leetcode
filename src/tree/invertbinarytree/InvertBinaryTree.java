package tree.invertbinarytree;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/16 17:46
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)){
            return root;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if (root.left != null){
            invertTree(root.left);
        }

        if (root.right != null) {
            invertTree(root.right);
        }

        return root;
    }
}
