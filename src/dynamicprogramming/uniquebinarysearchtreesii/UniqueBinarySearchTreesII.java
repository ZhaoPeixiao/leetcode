package dynamicprogramming.uniquebinarysearchtreesii;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/5 19:49
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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new ArrayList<>();
        return buildTree(1, n);
    }

    public List<TreeNode> buildTree(int low, int high){
        List<TreeNode> arr = new ArrayList<>();

        if(high<low){
            arr.add(null);
            return arr;
        }

        for(int i=low; i<=high; i++){
            List<TreeNode> leftTrees = buildTree(low, i-1);
            List<TreeNode> rightTrees = buildTree(i+1, high);

            for(TreeNode left: leftTrees){
                for(TreeNode right: rightTrees){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;

                    arr.add(root);
                }
            }
        }
        return arr;
    }
}
