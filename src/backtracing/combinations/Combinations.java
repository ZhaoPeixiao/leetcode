package backtracing.combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/6 10:10
 */
class Solution {
    int target;
    Integer[] stack;
    Integer[] nums;

    List<List<Integer>> res;

    public List<List<Integer>> combine(int n, int k) {
        target = k;
        nums = new Integer[n];
        stack = new Integer[k];

        for (int i = 0; i < nums.length; i ++){
            nums[i] = i + 1;
        }

        res = new ArrayList<List<Integer>>();

        search(0);
        return res;
    }

    public void search(int p){
        if (p == target){
            res.add(new ArrayList<>(Arrays.asList(stack)));
            return;
        }

        for (Integer n : nums){
            if (p > 0 && n <= stack[p - 1]){
                continue;
            }

            stack[p] = n;
            search(p + 1);
        }
    }
}
