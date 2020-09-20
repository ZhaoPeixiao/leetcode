package array.searchinsertposition;

/**
 * @author Peixiao Zhao
 * @date 2020/9/20 14:26
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        for (int i = 0; i < nums.length; i ++){
            if (target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
