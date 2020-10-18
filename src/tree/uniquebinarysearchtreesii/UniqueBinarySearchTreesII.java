package tree.uniquebinarysearchtreesii;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/18 14:29
 */
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