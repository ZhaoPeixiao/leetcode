package array.constructbinarytreefrominorderandpostordertraversal;

/**
 * @author Peixiao Zhao
 * @date 2020/9/15 15:29
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
    int p;
    int[] inorder;
    int[] postorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.p = postorder.length - 1;
        this.inorder = inorder;
        this.postorder = postorder;

        return buildTree(0, postorder.length);
    }

    public TreeNode buildTree(int start, int end){
        if (start >= end){
            return null;
        }
        TreeNode root = new TreeNode(postorder[p]);
        int i;
        for (i = start; i < end && postorder[p] != inorder[i]; i ++){

        }
        p--;
        root.right = buildTree(i + 1, end);
        root.left = buildTree(start, i);

        return root;
    }
}
