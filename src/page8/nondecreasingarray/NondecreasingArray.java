package page8.nondecreasingarray;

/**
 * @author Peixiao Zhao
 * @date 2020/9/10
 */
class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return true;
        }
        int times = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (times <= 0) {
                    return false;
                }
                times--;
                if (i >= 2) {
                    if(nums[i]<nums[i-2]){
                        nums[i] = nums[i - 1];
                    }
                }
            }
        }
        return true;
    }
}
