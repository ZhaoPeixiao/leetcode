package page4.convertsortedarraytobinarysearchtree;

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
    public TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums, 0, nums.length - 1);
    }

    public TreeNode insert(int[] nums, int start, int end){
        if (start > end) {
            return null;
        }
        int middle = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = insert(nums, start, middle - 1);
        node.right = insert(nums, middle + 1, end);
        return node;
    }
}
