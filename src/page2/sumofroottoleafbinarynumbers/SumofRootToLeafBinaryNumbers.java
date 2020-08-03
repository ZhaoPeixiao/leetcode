package page2.sumofroottoleafbinarynumbers;

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
    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }

    public int sumRootToLeaf(TreeNode root, int curr) {

        if (root == null)
            return 0;

        int s = 2*curr + root.val;

        if (root.left == null && root.right == null)
            return s;

        return sumRootToLeaf(root.left, s) + sumRootToLeaf(root.right, s);
    }
}
