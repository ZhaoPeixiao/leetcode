package warmup.page3.intersectionoftwoarrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int i : nums1){
            set.add(i);
        }

        for (int i : nums2){
            if (set.contains(i)) {
                intersection.add(i);
            }
        }

        return intersection.stream().mapToInt(i ->i).toArray();

    }
}
