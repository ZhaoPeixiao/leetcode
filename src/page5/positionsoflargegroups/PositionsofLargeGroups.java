package page5.positionsoflargegroups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        if (S == null || S.length() == 0) {
            return res;
        }
        int i = 0;
        for (int j = 0; j < S.length(); j ++){
            if (j == S.length() - 1 || S.charAt(j) != S.charAt(j + 1)) {
                if (j - i + 1 >= 3){
                    res.add(Arrays.asList(new Integer[]{i, j}));
                }
                i = j + 1;
            }
        }
        return res;
    }
}
