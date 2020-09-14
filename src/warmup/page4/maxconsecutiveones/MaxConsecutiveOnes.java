package warmup.page4.maxconsecutiveones;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                j++;
            } else {
                max = Math.max(j, max);
                j = 0;
            }
        }
        max = Math.max(j, max);
        return max;
    }
}
