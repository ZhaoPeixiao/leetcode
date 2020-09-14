package array.foursum;

import java.util.*;

/**
 * @author Peixiao Zhao
 * @date 2020/9/14 16:48
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int a = 0; a < nums.length - 3; a ++){
            for (int b = a + 1; b < nums.length - 2; b ++){
                int c = b + 1, d = nums.length - 1;
                while (c < d){
                    int sum = nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum == target){
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[a]);
                        tmp.add(nums[b]);
                        tmp.add(nums[c]);
                        tmp.add(nums[d]);
                        set.add(tmp);
                        c ++;
                        d --;
                        while (c < d && nums[c] == nums[c - 1]){
                            c ++;
                        }
                        while (d > c && nums[d] == nums[d + 1]){
                            d --;
                        }
                    }
                    else if (sum < target){
                        c ++;
                    }
                    else{
                        d --;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}
