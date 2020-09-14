package warmup.page3.smallestrangei;

/**
 * @Author: Peixiao Zhao
 */
public class SmallestRangeI {class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = A[0];
        int min = A[0];
        if (A.length == 1) {
            return 0;
        }
        for (int n : A){
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return Math.max(0, max - min - 2 * K);
    }
}
}
