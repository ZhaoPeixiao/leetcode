package warmup.page2.squaresofasortedarray;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i ++){
            A[i] = (A[i] * A[i]);
        }
        Arrays.sort(A);
        return A;
    }
}
