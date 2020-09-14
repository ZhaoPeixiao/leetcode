package warmup.page7.largestnumberatleasttwiceofothers;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int secondMax = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i ++){
            secondMax = Math.max(secondMax, Math.min(max, nums[i]));
            max = Math.max(max, nums[i]);
            if (max == nums[i]){
                maxIndex = i;
            }
        }
        if (max >= 2 * secondMax) {
            return maxIndex;
        }
        return -1;
    }
}
