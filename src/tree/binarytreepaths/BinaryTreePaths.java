package tree.binarytreepaths;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/13 14:44
 */
class Solution {
    List<String> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        findPath(root);
        return res;
    }

    public void findPath(TreeNode node){
        if (node == null){
            return;
        }

        path.add(node.val);

        if (node.left == null && node.right == null){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(path.get(0));
            for (int i = 1; i < path.size(); i ++){
                stringBuilder.append("->").append(path.get(i));
            }
            res.add(stringBuilder.toString());
        }

        findPath(node.left);
        findPath(node.right);

        path.remove(path.size() - 1);
    }
}
