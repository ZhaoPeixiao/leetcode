package page6.subtreeofanothertree;

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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (isEqual(s, t)) {
            return true;
        }
        boolean left  = s.left != null ? isSubtree(s.left,  t)  : false;
        boolean right = s.right != null ? isSubtree(s.right, t)  : false;
        return left || right;
    }

    public boolean isEqual(TreeNode s, TreeNode t){
        if (s == null && t == null) {
            return true;
        } else if (s == null || t == null || s.val != t.val) {
            return false;
        }
        return isEqual(s.left, t.left) && isEqual(s.right, t.right);
    }
}
