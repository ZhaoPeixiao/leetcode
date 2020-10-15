package tree.constructbinarytreefrompreorderandinordertraversal;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/15 17:13
 */
class Solution {
    int p = 0;
    int[] preorder;
    int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        return buildTree(0, preorder.length);
    }

    public TreeNode buildTree(int start, int end){
        if (start >= end){
            return null;
        }

        TreeNode root = new TreeNode(preorder[p]);

        int i;
        for (i = start; i < end && preorder[p] != inorder[i]; i ++);

        p ++;
        root.left = buildTree(start, i);
        root.right = buildTree(i + 1, end);

        return root;
    }
}
