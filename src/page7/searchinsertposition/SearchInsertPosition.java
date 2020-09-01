package page7.searchinsertposition;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }

        if (target > nums[nums.length - 1]){
            return nums.length;
        }
        int low = 0, high  = nums.length - 1;
        while (low < high){
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return high;
    }
}
