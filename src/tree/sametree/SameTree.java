package tree.sametree;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/17 10:06
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
