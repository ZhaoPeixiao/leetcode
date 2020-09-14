package warmup.page4.movezeroes;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i - zeroCount] = nums[i];
                if (zeroCount > 0) {
                    nums[i] = 0;
                }
            } else {
                zeroCount++;
            }
        }
    }
}
