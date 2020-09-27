package string.generateparentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/9/27 13:17
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        if (n <= 0){
            return new ArrayList<>();
        }
        ArrayList<String> res = new ArrayList<>();
        dfs(res, "", n, n);
        return res;
    }

    public void dfs(ArrayList<String> res, String s, int left, int right){
        if (left > right){
            return;
        }

        if (left == 0 && right == 0){
            res.add(s);
        }

        if (left > 0){
            dfs(res, s + "(", left - 1, right);
        }

        if (right > 0){
            dfs(res, s + ")", left, right - 1);
        }
    }
}
