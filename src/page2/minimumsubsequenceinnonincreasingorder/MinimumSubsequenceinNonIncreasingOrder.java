package page2.minimumsubsequenceinnonincreasingorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i : nums){
            sum += i;
        }
        sum -= nums[nums.length - 1];
        List<Integer> res = new ArrayList<>();
        res.add(nums[nums.length - 1]);
        int tmp = nums[nums.length - 1];
        for (int i = nums.length - 2; i >=0; i --){
            if (tmp > sum) {
                break;
            }
            tmp += nums[i];
            sum -= nums[i];
            res.add(nums[i]);
        }
        return res;
    }
}
