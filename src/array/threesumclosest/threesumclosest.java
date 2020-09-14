package array.threesumclosest;

import java.util.Arrays;

/**
 * @author Peixiao Zhao
 * @date 2020/9/14 16:41
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3){
            return Integer.MIN_VALUE;
        }
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int res = 0;
        for (int start = 0; start < nums.length; start ++){
            int mid = start + 1, end = nums.length - 1;
            while (mid < end){
                int sum = nums[start] + nums[mid] + nums[end];
                int diff = Math.abs(target - sum);
                if (diff < minDiff){
                    minDiff = diff;
                    res = sum;
                }
                if (sum < target){
                    mid ++;
                    while (mid < end && nums[mid] == nums[mid - 1]){
                        mid ++;
                    }
                }
                else {
                    end --;
                    while (end > mid && nums[end] == nums[end + 1]){
                        end --;
                    }
                }
            }
        }
        return res;
    }
}
