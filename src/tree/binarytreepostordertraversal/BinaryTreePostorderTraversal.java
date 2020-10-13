package tree.binarytreepostordertraversal;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author Peixiao Zhao
 * @date 2020/10/13 14:41
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || stack.size() > 0){
            while (cur != null){
                res.add(cur.val);
                stack.push(cur);
                cur = cur.right;
            }
            cur = stack.pop();
            cur = cur.left;
        }
        Collections.reverse(res);
        return res;
    }
}
