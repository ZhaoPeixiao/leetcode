package backtracing.combinationsumii;

import java.util.*;

/**
 * @author Peixiao Zhao
 * @date 2020/10/6 10:04
 */
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
            return new ArrayList<List<Integer>>();
        }
        Set<List<Integer>> rt = new HashSet<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        Arrays.sort(candidates);
        dfs(0, target, rt, cur, candidates);
        return new ArrayList<List<Integer>>(rt);
    }
    private void dfs(int start, int target, Set<List<Integer>> rt,
                     ArrayList<Integer> cur, int[] candidates) {
        if (target == 0) {
            rt.add(new ArrayList<Integer>(cur));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            // candidates[i] > target，则递归结束，后面不可能是解
            if (candidates[i] > target) {
                return;
            }
            cur.add(candidates[i]);
            dfs(i + 1, target - candidates[i], rt, cur, candidates);
            cur.remove(cur.size() - 1);
        }
    }
}
