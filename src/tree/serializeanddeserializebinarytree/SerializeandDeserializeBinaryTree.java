package tree.serializeanddeserializebinarytree;

import tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Peixiao Zhao
 * @date 2020/10/18 14:15
 */
class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);

        while (!deque.isEmpty()){
            TreeNode p = deque.pop();
            if (p == null) {
                stringBuilder.append(",#");
            }else{
                stringBuilder.append("," + p.val);
                deque.add(p.left);
                deque.add(p.right);
            }
        }

        return stringBuilder.toString().substring(1);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }

        String[] s = data.split(",");
        TreeNode[] node = new TreeNode[s.length];

        for (int i = 0; i < node.length; i ++){
            if (!"#".equals(s[i])){
                node[i] = new TreeNode(Integer.valueOf(s[i]));
            }
        }
        int parent = 0;
        for (int i = 0; parent * 2 + 2 < s.length; i ++){
            if (node[i] != null) {
                node[i].left = node[parent * 2 + 1];
                node[i].right = node[parent * 2 + 2];
                parent ++;
            }
        }

        return node[0];
    }
}
