package page2.narytreepostordertraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}


class Solution {
    public List<Integer> postorder(Node root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<Integer> postOrderValues = new ArrayList<>();
        postorder(root, postOrderValues);
        return postOrderValues;
    }

    private void postorder(Node root, List<Integer> postOrderValues) {
        if(root != null) {
            List<Node> children = root.children;
            if(children != null) {
                for(Node child: children) {
                    postorder(child, postOrderValues);
                }
            }
            postOrderValues.add(root.val);
        }
    }
}

