package page7.secondminimumnodeinabinarytree;

import java.util.LinkedList;
import java.util.Queue;

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
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int res = Integer.MAX_VALUE;
        boolean found = false;
        int smallest = root.val;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i ++){
                TreeNode node = queue.poll();
                if (node.val == smallest) {
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                else if (node.val > smallest && node.val <= res){
                    res = node.val;
                    found = true;
                }
            }
        }
        return found ? res : -1;
    }
}
