package page2.findpositiveintegersolutionforagivenequation;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
abstract class CustomFunction {
    // Returns f(x, y) for any given positive integers x and y.
    // Note that f(x, y) is increasing with respect to both x and y.
    // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
    public abstract int f(int x, int y);
}


class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();
        for (int l = 1, r = 1000, v = customfunction.f(l, r); l <= 1000  && r > 0; v = customfunction.f(l, r)) {
            if (v < z) l++;
            else if (v > z) r--;
            else res.add(List.of(l++, r--));
        }
        return res;
    }
}
