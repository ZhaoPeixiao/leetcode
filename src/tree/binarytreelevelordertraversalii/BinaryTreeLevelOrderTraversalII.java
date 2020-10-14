package tree.binarytreelevelordertraversalii;

import tree.TreeNode;

import java.util.*;

/**
 * @author Peixiao Zhao
 * @date 2020/10/14 14:02
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> rt = new ArrayList<List<Integer>>();
        if (root == null) {
            return rt;
        }
        final TreeNode END = new TreeNode(0);
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        List<Integer> level = new LinkedList<Integer>();
        deque.add(root);
        deque.add(END);
        while (!deque.isEmpty()) {
            TreeNode p = deque.pop();
            if (p == END) {
                rt.add(new ArrayList<Integer>(level));
                level.clear();
                if (!deque.isEmpty()) {
                    deque.add(END);
                }
            } else {
                level.add(p.val);
                if (p.left != null) {
                    deque.add(p.left);
                }
                if (p.right != null) {
                    deque.add(p.right);
                }
            }
        }
        Collections.reverse(rt);
        return rt;
    }
}
