package warmup.page5.degreeofanarray;

import java.util.HashMap;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findShortestSubArray(int[] nums) {
        // map element to {firstIndex, lastIndex, frequency}
        HashMap<Integer, int[]> dict = new HashMap<>();
        int len = nums.length;
        int maxFreq = 1;

        for (int i = 0; i < len; i++) {
            if (!dict.containsKey(nums[i])) {
                dict.put(nums[i], new int[]{i, i, 1});
            } else {
                int[] entry = dict.get(nums[i]);
                entry[1] = i;
                entry[2]++;
                if (entry[2] > maxFreq) maxFreq = entry[2];
            }
        }

        int min = len;
        for (int[] a : dict.values()) {
            if (a[2] == maxFreq) {
                int size = a[1] - a[0] + 1;
                if (size < min) min = size;
            }
        }
        return min;
    }
}
