package array.combinationsumii;

import java.util.*;

/**
 * @author Peixiao Zhao
 * @date 2020/9/15 15:09
 */
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0){
            return new ArrayList<>();
        }
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, target, res, cur, candidates);
        return new ArrayList<List<Integer>>(res);
    }

    public void dfs(int start, int target, Set<List<Integer>> res, ArrayList<Integer> cur, int[] candidates){
        if (target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = start; i < candidates.length; i ++){
            if (candidates[i] > target){
                return;
            }
            cur.add(candidates[i]);
            dfs(i + 1, target - candidates[i], res, cur, candidates);
            cur.remove(cur.size() - 1);
        }
    }
}
