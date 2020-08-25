package page6.binarytreetilt;

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
    int tilt = 0;
    public int findTilt(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)){
            return tilt;
        }
        sum(root);
        return tilt;
    }

    public int sum(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        tilt += Math.abs(left - right);
        return left + right + root.val;
    }
}
