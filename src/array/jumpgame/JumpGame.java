package array.jumpgame;

/**
 * @author Peixiao Zhao
 * @date 2020/9/16 20:22
 */
class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0){
            return false;
        }

        int maxSetp = 0;
        for (int i = 0; i < nums.length; i ++){
            if (maxSetp >= nums.length - 1){
                return true;
            }
            if (nums[i] == 0 && maxSetp == i){
                return false;
            }
            maxSetp = Math.max(maxSetp, nums[i] + i);
        }
        return true;
    }
}
