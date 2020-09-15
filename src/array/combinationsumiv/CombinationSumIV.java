package array.combinationsumiv;

import java.util.Arrays;

/**
 * @author Peixiao Zhao
 * @date 2020/9/15 15:19
 */
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        getCombos(target, dp, nums);
        return dp[target];
    }

    public int getCombos(int target, int[] dp, int[] nums){
        if (dp[target] != -1){
            return dp[target];
        }
        int count = 0;
        for (int n : nums){
            if (n > target){
                continue;
            }
            count += getCombos(target - n, dp, nums);
        }
        dp[target] = count;
        return count;
    }
}
