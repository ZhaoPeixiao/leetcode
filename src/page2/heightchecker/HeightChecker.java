package page2.heightchecker;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int heightChecker(int[] heights) {
        int[] tmp = heights.clone();
        Arrays.sort(tmp);
        int res = 0;
        for (int i = 0; i < heights.length; i ++){
            if (tmp[i] != heights[i]){
                res ++;
            }
        }
        return res;
    }
}
