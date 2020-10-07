package backtracing.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/7 11:05
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<List<Integer>>();
        }
        ArrayList<List<Integer>> rt = new ArrayList<List<Integer>>();
        if (nums.length == 1) {
            rt.add(new ArrayList<Integer>(Arrays.asList(nums[0])));
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (List<Integer> l : permute(resetof(nums, i))) {
                    l.add(nums[i]);
                    rt.add(l);
                }
            }
        }
        return rt;
    }


    public int[] resetof(int[] nums, int index) {
        int[] rt = new int[nums.length - 1];
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != index) {
                rt[s++] = nums[i];
            }
        }
        return rt;
    }

}
