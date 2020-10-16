package tree.kthsmallestelementinabst;

import tree.TreeNode;

import java.util.Stack;

/**
 * @author Peixiao Zhao
 * @date 2020/10/16 17:48
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()) {
                p = stack.pop();
                if (--k == 0) {
                    return p.val;
                }
                p = p.right;
            }
        }
        return 0;
    }
}
