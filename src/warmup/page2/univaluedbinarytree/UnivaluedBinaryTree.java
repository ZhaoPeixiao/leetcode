package warmup.page2.univaluedbinarytree;

/**
 * @Author: Peixiao Zhao
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean l = true;
        boolean r = true;
        if (root.left != null) {
            l = root.val == root.left.val;
        }
        if (root.right != null) {
            r = root.val == root.right.val;
        }
        return l && r && isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
