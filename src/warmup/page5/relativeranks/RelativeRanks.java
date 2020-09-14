package warmup.page5.relativeranks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        Integer[] tmp = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[i];
        }

        Arrays.sort(tmp, Collections.reverseOrder());

        Map<Integer, Integer> position = new HashMap<>();
        for (int i = 0; i < tmp.length; i++) {
            position.put(tmp[i], i);
        }

        String[] res = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int pos = position.get(nums[i]) + 1;
            if (pos == 1){
                res[i] = "Gold Medal";
            }
            else if (pos == 2) {
                res[i] = "Silver Medal";
            }
            else if (pos == 3) {
                res[i] = "Bronze Medal";
            }
            else {
                res[i] = Integer.toString(pos);
            }
        }

        return res;
    }
}
