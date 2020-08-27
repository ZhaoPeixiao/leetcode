package page6.binaryprefixdivisibleby5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int value = 0;
        for (int num : A){
            value = (value << 1) | num;
            value %= 5;
            res.add(value == 0);
        }
        return res;
    }
}
