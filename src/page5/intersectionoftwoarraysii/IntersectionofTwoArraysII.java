package page5.intersectionoftwoarraysii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int lastIndex = 0;
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i ++){
            for (int j = lastIndex; j < nums2.length; j ++){
                if (nums1[i] == nums2[j]){
                    tmp.add(nums1[i]);
                    lastIndex = j + 1;
                    break;
                }
            }
        }

        int[] res = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i ++){
            res[i] = tmp.get(i);
        }

        return res;
    }
}
