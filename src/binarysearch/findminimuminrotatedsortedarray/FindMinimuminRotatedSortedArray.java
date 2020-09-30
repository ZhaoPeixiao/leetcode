package binarysearch.findminimuminrotatedsortedarray;

import java.util.Arrays;

/**
 * @author Peixiao Zhao
 * @date 2020/9/30 17:55
 */
class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }

        if (nums.length == 2){
            return Math.min(nums[0], nums[1]);
        }

        int s = 0, e = nums.length - 1;

        int m = (s + e) / 2;

        if (nums[s] < nums[e]){
            return nums[s];
        }

        if (nums[m] > nums[s]){
            return findMin(Arrays.copyOfRange(nums, m + 1, e + 1));
        }

        return findMin(Arrays.copyOfRange(nums, s, m + 1));
    }
}
