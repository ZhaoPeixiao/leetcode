package warmup.page1.decompressrunlengthencodedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < nums.length/2; i++){
            for (int j = 0; j < nums[2*i]; j++){
                li.add(nums[2*i+1]);
            }
        }
        return li.stream().mapToInt(Integer::valueOf).toArray();
    }
}
