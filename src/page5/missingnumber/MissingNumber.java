package page5.missingnumber;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n + 1) * n / 2;
        for (int num : nums){
            sum -= num;
        }
        return sum;
    }
}
