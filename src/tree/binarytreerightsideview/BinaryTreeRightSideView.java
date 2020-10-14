package tree.binarytreerightsideview;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/14 14:03
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        res.add(root.val);

        List<Integer> left = rightSideView(root.left);
        List<Integer> right = rightSideView(root.right);

        res.addAll(right);

        if (left.size() > right.size()){
            res.addAll(left.subList(right.size(), left.size()));
        }

        return res;
    }
}
