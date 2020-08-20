package page5.minimumdistancebetweenbstnodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        getArray(root, list);
        Collections.sort(list);

        int min = Integer.MAX_VALUE;

        for(int k = 0; k < list.size()-1; k++){
            min = Math.min(min, Math.abs(list.get(k) - list.get(k+1)));
        }

        return min;
    }

    public void getArray(TreeNode root, List<Integer> list){
        if(root != null){
            getArray(root.left,list);
            getArray(root.right, list);
            list.add(root.val);
        }
    }
}
