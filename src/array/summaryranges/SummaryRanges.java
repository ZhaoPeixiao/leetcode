package array.summaryranges;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/9/20 14:48
 */
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0){
            return res;
        }

        for (int i = 0; i < nums.length; i ++){
            int st = nums[i];
            int ed = st;
            while (i + 1 < nums.length && nums[i + 1] - ed == 1){
                i ++;
                ed ++;
            }
            if (ed == st){
                res.add(st + "");
            }
            else{
                res.add(st + "->" + ed);
            }
        }
        return res;
    }
}
