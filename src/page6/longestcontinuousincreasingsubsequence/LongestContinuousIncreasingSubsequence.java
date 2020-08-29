package page6.longestcontinuousincreasingsubsequence;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 1;
        int maxLen = Integer.MIN_VALUE;
        while (j < nums.length) {
            if (nums[j] <= nums[j - 1]){
                maxLen = Math.max(maxLen, j - i);
                i = j;
            }
            j ++;
        }
        maxLen = Math.max(maxLen, j - i);
        return maxLen;
    }
}