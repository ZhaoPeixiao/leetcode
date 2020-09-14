package warmup.page3.averageoflevelsinbinarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<Double> averageOfLevels(TreeNode root) {
        Map<Integer, List<Double>> map = new HashMap<>();
        travel(root, 0, map);
        double[] tmp = new double[map.keySet().size()];
        for (Integer key : map.keySet()){
            double sum = 0.0;
            for (double value : map.get(key)){
                sum += value;
            }
            tmp[key] = sum / map.get(key).size();
        }
        List<Double> res = new ArrayList<>();
        for (double v : tmp){
            res.add(v);
        }
        return res;
    }

    public void travel(TreeNode root, int depth, Map<Integer, List<Double>> map){
        if (root == null) {
            return;
        }
        if (!map.containsKey(depth)) {
            List<Double> tmp = new ArrayList<>();
            tmp.add((double) root.val);
            map.put(depth, tmp);
        }
        else {
            List<Double> tmp = map.get(depth);
            tmp.add((double) root.val);
            map.put(depth, tmp);
        }


        if (root.left != null) {
            travel(root.left, depth + 1, map);
        }

        if (root.right != null) {
            travel(root.right, depth + 1, map);
        }

    }
}
