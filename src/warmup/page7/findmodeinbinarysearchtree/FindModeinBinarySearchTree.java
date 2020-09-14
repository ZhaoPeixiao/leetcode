package warmup.page7.findmodeinbinarysearchtree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            int maxCount = 0;
            int count = 0;
            Integer currNum = null;
            Stack<TreeNode> stack = new Stack<>();
            TreeNode currNode = root;
            while (!stack.isEmpty() || currNode != null) {
                if (currNode != null) {
                    stack.push(currNode);
                    currNode = currNode.left;
                }
                else{
                    currNode = stack.pop();
                    if (currNum != null && currNum != currNode.val){
                        count = 0;
                    }
                    currNum = currNode.val;
                    count ++;
                    if (count == maxCount) {
                        list.add(currNum);
                    } else if (count > maxCount) {
                        maxCount = count;
                        list.clear();
                        list.add(currNum);
                    }
                    currNode = currNode.right;
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i ++){
            res[i] = list.get(i);
        }
        return res;
    }
}
