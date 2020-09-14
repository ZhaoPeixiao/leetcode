package warmup.page4.faircandyswap;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = 0, sum2 = 0;
        Set<Integer> set = new HashSet<>();
        for (int a : A){
            sum1 += a;
        }
        for (int b : B){
            set.add(b);
            sum2 += b;
        }

        int diff = (sum2 - sum1) / 2;
        for (int a : A){
            if (set.contains(a + diff)) {
                return new int[]{a, a + diff};
            }
        }
        return null;
    }
}
