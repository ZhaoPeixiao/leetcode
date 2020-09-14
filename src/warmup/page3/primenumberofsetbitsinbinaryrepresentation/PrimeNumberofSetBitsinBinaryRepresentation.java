package warmup.page3.primenumberofsetbitsinbinaryrepresentation;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int countPrimeSetBits(int L, int R) {
        Set<Integer> primeSet = new HashSet<>();
        primeSet.add(2);
        primeSet.add(3);
        primeSet.add(5);
        primeSet.add(7);
        primeSet.add(11);
        primeSet.add(13);
        primeSet.add(17);
        primeSet.add(19);
        int retVal = 0;
        for (; L <= R; L++) {
            if (primeSet.contains(Integer.bitCount(L))) {
                retVal++;
            }
        }

        return retVal;
    }
}
