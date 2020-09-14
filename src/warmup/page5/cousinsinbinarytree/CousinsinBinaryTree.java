package warmup.page5.cousinsinbinarytree;

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
    public boolean isCousins(TreeNode root, int x, int y) {
        int levelX = getDepth(root, x, 1);
        int levelY = getDepth(root, y, 1);
        if(levelX!= levelY || isSameParent(root, x, y)) return false;
        else return true;
    }

    public int getDepth(TreeNode root, int x, int level){
        if (root == null) {
            return 0;
        }
        if (root.val == x) {
            return level;
        }
        int res = getDepth(root.left, x, level + 1);
        if (res != 0) {
            return res;
        }
        return getDepth(root.right, x, level + 1);
    }

    public boolean isSameParent(TreeNode root, int x, int y){
        if (root == null) {
            return false;
        }
        if (root.left == null) {
            return isSameParent(root.right, x, y);
        }
        if (root.right == null) {
            return isSameParent(root.left, x, y);
        }
        if ((root.left.val == x && root.right.val == y)
            || (root.left.val == y && root.right.val == x)){
            return true;
        }
        if (isSameParent(root.left, x, y)) {
            return true;
        }
        return isSameParent(root.right, x, y);
    }
}
