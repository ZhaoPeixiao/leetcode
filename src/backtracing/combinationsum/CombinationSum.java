package backtracing.combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/6 9:57
 */
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();

        Arrays.sort(candidates);
        dfs(0, target, res, cur, candidates);
        return res;
    }

    public void dfs(int start, int target, List<List<Integer>> res, ArrayList<Integer> cur, int[] candidates){
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = start; i < candidates.length; i ++){
            if (candidates[i] > target){
                return;
            }
            cur.add(candidates[i]);
            dfs(i, target - candidates[i], res, cur, candidates);
            cur.remove(cur.size() - 1);
        }
    }
}
