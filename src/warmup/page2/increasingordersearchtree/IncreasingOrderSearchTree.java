package warmup.page2.increasingordersearchtree;

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
    List<TreeNode> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inOrderTraversal(root);
        TreeNode nodes;
        nodes = list.get(0);
        for (int i = 0 ; i < list.size() - 1 ; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i+1);
        }
        return nodes;
    }

    public void inOrderTraversal(TreeNode root){
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        list.add(root);
        inOrderTraversal(root.right);
    }
}
