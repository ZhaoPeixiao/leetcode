package binarysearch.sqrtx;

/**
 * @author Peixiao Zhao
 * @date 2020/10/1 19:37
 */
class Solution {
    public int mySqrt(int x) {
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return 0;
        }

        int start = 1;
        int end = x;

        while (start < end){
            int m = start + (end - start) / 2;

            int m1 = x / m;
            int m2 = x / (m + 1);

            if (m == m1){
                return m;
            }
            if (m + 1 == m2) {
                return m + 1;
            }
            if (m < m1 && m + 1 > m2) {
                return m;
            }
            if (m1 < m) {
                end = m;
            } else {
                start = m + 1;
            }
        }
        return 1;
    }
}
