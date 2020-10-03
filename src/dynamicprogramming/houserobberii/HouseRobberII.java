package dynamicprogramming.houserobberii;

import java.util.Arrays;

/**
 * @author Peixiao Zhao
 * @date 2020/10/3 17:34
 */
class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        int left = helper(Arrays.copyOfRange(nums, 0, nums.length - 1));
        int right = helper(Arrays.copyOfRange(nums, 1, nums.length));

        return Math.max(left, right);
    }

    public int helper(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++){
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}