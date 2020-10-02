package divideandconquer.maximumsubarray;

/**
 * @author Peixiao Zhao
 * @date 2020/10/2 20:58
 */
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int curSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i ++){
            curSum = Math.max(curSum + nums[i], nums[i]);
            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }
}
