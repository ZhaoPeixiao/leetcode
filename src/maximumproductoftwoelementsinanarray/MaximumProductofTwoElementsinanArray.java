package maximumproductoftwoelementsinanarray;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
