package warmup.page1.numberofgoodpairs;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            Integer val = map.get(n);
            if (val != null) {
                map.put(n, val + 1);
            } else {
                map.put(n, 1);
            }
        }
        int pairCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            pairCount += (v / 2f) * (v - 1);
        }
        return pairCount;
    }
}

