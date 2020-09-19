package array.removeduplicatesfromsortedarrayii;

/**
 * @author Peixiao Zhao
 * @date 2020/9/19 16:24
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int cur = 2;
        for (int i = cur; i < nums.length; i ++){
            if (!(nums[i] == nums[cur - 1] && nums[i] == nums[cur - 2])){
                nums[cur ++] = nums[i];
            }
        }
        return Math.min(cur, nums.length);
    }
}
