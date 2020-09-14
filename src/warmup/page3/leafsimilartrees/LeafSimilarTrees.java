package warmup.page3.leafsimilartrees;

import java.util.ArrayList;

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        int i;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        leaf(A, root1);
        leaf(B, root2);
        if (A.size() != B.size()) {
            return false;
        }
        for (i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void leaf(ArrayList A, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            A.add(root.val);
        }
        leaf(A, root.left);
        leaf(A, root.right);
    }
}

