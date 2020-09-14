package warmup.page4.constructstringfrombinarytree;

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
    public String tree2str(TreeNode t) {
        StringBuilder stringBuilder = new StringBuilder();
        print(t, stringBuilder);
        return stringBuilder.toString();
    }

    public void print(TreeNode node, StringBuilder res){
        if (node == null) {
            return;
        }
        res.append(node.val);
        if (node.left != null) {
            res.append("(");
            print(node.left, res);
            res.append(")");
        }
        if (node.left == null && node.right != null) {
            res.append("()");
        }
        if (node.right != null) {
            res.append("(");
            print(node.right, res);
            res.append(")");
        }
    }
}
