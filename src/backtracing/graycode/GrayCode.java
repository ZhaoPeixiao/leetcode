package backtracing.graycode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/7 10:55
 */
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> rt = new ArrayList<Integer>();
        if (n < 0) {
            return rt;
        }
        for (int i = 0; i < Math.pow(2, n); i++) {
            rt.add((i >> 1) ^ i);
        }
        return rt;
    }
}
