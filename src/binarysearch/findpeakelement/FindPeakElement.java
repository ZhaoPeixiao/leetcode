package binarysearch.findpeakelement;

/**
 * @author Peixiao Zhao
 * @date 2020/9/30 18:00
 */
class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high){
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid + 1]){
                high = mid;
            }else{
                low = mid + 1;
            }
        }

        return low;
    }
}
