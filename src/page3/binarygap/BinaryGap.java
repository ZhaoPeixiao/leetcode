package page3.binarygap;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int binaryGap(int N) {
        int cnt = -1;
        int max = 0;
        while (N > 0) {
            if ((N & 1) == 1) {
                if (cnt == -1) {
                    cnt = 1;
                } else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            } else {
                if (cnt != -1) {
                    cnt++;
                }
            }
            N /= 2;
        }
        return max;
    }
}
