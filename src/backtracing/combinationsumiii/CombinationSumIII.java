package backtracing.combinationsumiii;
import java.util.*;

/**
 * @author Peixiao Zhao
 * @date 2020/10/6 10:06
 */
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (k < 1 || n < 1){
            return res;
        }

        List<Integer> cur = new ArrayList<Integer>();
        dfs(res, cur, 0, k, n, 1);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> cur, int sum, int k, int n, int level){
        if(sum == n && k == 0){
            res.add(new ArrayList<Integer>(cur));
            return;
        }else if (sum > n || k <= 0){
            return;
        }

        for (int i = level; i <= 9; i ++){
            cur.add(i);
            dfs(res, cur, sum + i, k - 1, n, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
