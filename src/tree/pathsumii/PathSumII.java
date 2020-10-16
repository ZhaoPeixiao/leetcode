package tree.pathsumii;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/17 9:59
 */
class Solution {

    List<List<Integer>> res;
    List<Integer> path;
    int sum;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res = new ArrayList<List<Integer>>();
        path = new ArrayList<Integer>();
        this.sum = sum;
        if (root == null) {
            return res;
        }
        helper(root, 0);
        return res;
    }

    public void helper(TreeNode node, int cur){
        cur += node.val;
        path.add(node.val);

        boolean isLeaf = (node.left == null) && (node.right == null);

        if (cur == sum && isLeaf){
            res.add(new ArrayList<>(path));
        }
        if (node.left != null) {
            helper(node.left, cur);
        }
        if (node.right != null) {
            helper(node.right, cur);
        }

        cur -= node.val;
        path.remove(path.size() - 1);
    }
}
