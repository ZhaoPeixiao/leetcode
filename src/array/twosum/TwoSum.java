package array.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Peixiao Zhao
 * @date 2020/9/14 16:29
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 1){
            return new int[2];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            int diff = target - nums[i];
            if (map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
