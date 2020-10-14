package tree.binarytreezigzaglevelordertraversal;

import tree.TreeNode;

import java.util.*;

/**
 * @author Peixiao Zhao
 * @date 2020/10/14 14:06
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        final TreeNode END = new TreeNode(0);

        Deque<TreeNode> deque = new LinkedList<>();
        List<Integer> level = new LinkedList<>();
        int count = 0;

        deque.addLast(root);
        deque.addLast(END);

        while (!deque.isEmpty()){
            TreeNode p = deque.pop();
            if (p == END){
                if (count % 2 == 1){
                    Collections.reverse(level);
                }
                count ++;

                res.add(new ArrayList<>(level));
                level.clear();

                if (!deque.isEmpty()){
                    deque.addLast(END);
                }
            }
            else{
                level.add(p.val);

                if (p.left != null) {
                    deque.addLast(p.left);
                }
                if (p.right != null) {
                    deque.addLast(p.right);
                }
            }
        }
        return res;
    }
}
