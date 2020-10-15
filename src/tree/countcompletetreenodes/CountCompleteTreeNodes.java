package tree.countcompletetreenodes;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/15 17:21
 */
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null){
            return 0;
        }

        int leftHeight = 0;
        int rightHeight = 0;

        TreeNode p = root;
        while (p != null){
            p = p.left;
            leftHeight ++;
        }

        p = root;
        while (p != null){
            p = p.right;
            rightHeight ++;
        }

        if (leftHeight == rightHeight){
            return (1 << leftHeight) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
