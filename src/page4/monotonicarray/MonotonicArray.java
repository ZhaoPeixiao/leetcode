package page4.monotonicarray;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isMonotonic(int[] A) {
        if (A.length < 2) {
            return true;
        }
        Boolean inc = null;
        for (int i = 1; i < A.length; i++) {
            if (A[i] - A[i - 1] > 0 && (inc == null || inc)) {
                inc = true;
            } else if (A[i] - A[i - 1] < 0 && (inc == null || !inc)) {
                inc = false;
            } else if (A[i] == A[i - 1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
