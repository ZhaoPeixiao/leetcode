package binarysearch.countcompletetreenodes;

/**
 * @author Peixiao Zhao
 * @date 2020/9/30 17:36
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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = 0;
        int rightHeight = 0;

        TreeNode p = root;
        while (p != null) {
            p = p.left;
            leftHeight ++;
        }

        p = root;
        while (p != null) {
            p = p.right;
            rightHeight ++;
        }

        if (leftHeight == rightHeight){
            return (1 << leftHeight) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
