package page7.validperfectsquare;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isPerfectSquare (int x) {
        if (x == 0) return false;
        if (x == 1) return true;
        int left = 1, right = x;
        while (left <= right) {
            long mid = left + (long)(right - left) / 2;
            if (mid * mid == x) return true;
            if (mid * mid < x) {
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        return false;
    }
}
