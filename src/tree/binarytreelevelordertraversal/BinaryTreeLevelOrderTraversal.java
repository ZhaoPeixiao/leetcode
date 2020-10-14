package tree.binarytreelevelordertraversal;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/14 13:57
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        int toBePrinted = 1;
        int nextLevel = 0;

        List<Integer> level = new LinkedList<>();

        while (!deque.isEmpty()){
            TreeNode p = deque.poll();
            level.add(p.val);
            toBePrinted --;

            if (p.left != null){
                deque.addLast(p.left);
                nextLevel ++;
            }

            if (p.right != null){
                deque.addLast(p.right);
                nextLevel ++;
            }

            if (toBePrinted == 0){
                toBePrinted = nextLevel;
                nextLevel = 0;
                res.add(new ArrayList<Integer>(level));
                level.clear();
            }
        }

        return res;
    }
}
