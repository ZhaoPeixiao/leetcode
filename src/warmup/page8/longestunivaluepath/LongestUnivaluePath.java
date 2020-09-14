package warmup.page8.longestunivaluepath;

/**
 * @author Peixiao Zhao
 * @date 2020/9/7
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
    int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return ans;
    }

    public int helper(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        if (root.left == null || root.left.val != root.val){
            left = 0;
        }
        int right = helper(root.right);
        if (root.right == null || root.right.val != root.val){
            right = 0;
        }
        this.ans = Math.max(this.ans, left + right);
        return Math.max(left, right) + 1;
    }
}
