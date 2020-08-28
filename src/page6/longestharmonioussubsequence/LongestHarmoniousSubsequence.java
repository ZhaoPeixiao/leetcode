package page6.longestharmonioussubsequence;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findLHS(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i ++){
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);

            for (int j = -1; j <= 1; j += 2){
                if (map.containsKey(num + j)) {
                    ans = Math.max(ans, map.get(num + j) + map.get(num));
                }
            }
        }
        return ans;
    }
}
