package array.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/9/20 14:40
 */
class Solution {
    int target;
    Integer[] stack;
    List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        res = new ArrayList<>();
        for (int i = 0; i <= nums.length; i ++){
            target = i;
            stack = new Integer[i];
            search(0, nums);
        }
        return res;
    }

    public void search(int p, int[] nums){
        if (p == target){
            res.add(new ArrayList<Integer>(Arrays.asList(stack)));
            return;
        }

        for (int i = 0; i < nums.length; i ++){
            if (p > 0 && nums[i] <= stack[p - 1]){
                continue;
            }
            stack[p] = nums[i];
            search(p + 1, nums);
        }
    }

}
