package tree.sumroottoleafnumbers;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/18 14:22
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    int sumNumbers(TreeNode root, int cur){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return cur * 10 + root.val;
        }
        return sumNumbers(root.left, cur * 10 + root.val) + sumNumbers(root.right, cur*10+root.val);
    }

}
