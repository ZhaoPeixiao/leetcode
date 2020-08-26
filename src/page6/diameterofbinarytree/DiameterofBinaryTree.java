package page6.diameterofbinarytree;

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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameterOfBinaryTreeHelper(root)[1];
    }

    public int[] diameterOfBinaryTreeHelper(TreeNode root){
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = diameterOfBinaryTreeHelper(root.left);
        int[] right = diameterOfBinaryTreeHelper(root.right);
        int dia = Math.max(Math.max(left[1], right[1]), left[0] + right[0]);
        return new int[]{
                Math.max(left[0], right[0]) + 1, dia
        };
    }
}