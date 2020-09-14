package warmup.page4.convertbsttogreatertree;

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
    int sum;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        recur(root);
        return root;
    }

    public void recur(TreeNode node){
        if (node != null){
            recur(node.right);
            sum += node.val;
            node.val = sum;
            recur(node.left);
        }
    }
}
