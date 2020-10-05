package backtracing.generateparentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/6 10:14
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return new ArrayList<String>();
        }
        ArrayList<String> rt = new ArrayList<String>();
        dfs(rt, "", n, n);
        return rt;
    }

    public void dfs(ArrayList<String> res, String s, int left, int right){
        if (left > right){
            return;
        }

        if (left == 0 && right == 0){
            res.add(s);
        }

        if (left > 0) {
            dfs(res, s + "(", left - 1, right);
        }

        if (right > 0){
            dfs(res, s + ")", left, right - 1);
        }
    }
}
