package tree.lowestcommonancestorofabinarysearchtree;

import tree.TreeNode;

/**
 * @author Peixiao Zhao
 * @date 2020/10/16 17:52
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }

        int m = Math.min(p.val, q.val);
        int n = Math.max(p.val, q.val);

        while (root != null) {
            if (root.val < m) {
                root = root.right;
            }else if (root.val > n){
                root = root.left;
            }else {
                return root;
            }
        }

        return null;
    }
}
