package tree.constructbinarytreefrominorderandpostordertraversal;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/15 17:10
 */
class Solution {
    int p;
    int[] postorder;
    int[] inorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.p = postorder.length - 1;
        this.inorder = inorder;
        this.postorder = postorder;

        return buildTree(0, postorder.length);
    }

    TreeNode buildTree(int start, int end){
        if (start >= end){
            return null;
        }

        TreeNode root = new TreeNode(postorder[p]);

        int i;
        for (i = start; i < end && postorder[p] != inorder[i]; i ++);

        p --;
        root.right = buildTree(i + 1, end);
        root.left = buildTree(start, i);

        return root;
    }
}
