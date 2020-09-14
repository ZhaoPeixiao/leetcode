package warmup.page5.binarytreepaths;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, res, "");
        return res;
    }

    public void dfs(TreeNode root, List<String> res, String s){
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            s += root.val;
            res.add(s);
        }
        dfs(root.left, res, s + root.val + "->");
        dfs(root.right, res, s + root.val + "->");
    }
}
