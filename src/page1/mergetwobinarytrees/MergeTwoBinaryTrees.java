package page1.mergetwobinarytrees;

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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        TreeNode res = new TreeNode(0);
        res.val  = t1.val + t2.val;
        res.left = mergeTrees(t1.left == null? null : t1.left, t2.left == null? null : t2.left);
        res.right = mergeTrees(t1.right == null? null : t1.right, t2.right == null? null : t2.right);

        return res;
    }
}
