package page2.searchinabinarysearchtree;

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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val){
            return root;
        }
        if (val > root.val){
            return searchBST(root.right, val);
        }
        else{
            return searchBST(root.left, val);
        }
    }
}
