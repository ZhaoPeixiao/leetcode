package binarysearch.dividetwointegers;

/**
 * @author Peixiao Zhao
 * @date 2020/9/30 17:42
 */
class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }

        int res = 0;

        if (dividend == Integer.MIN_VALUE){
            res = 1;
            if (divisor == -1){
                return Integer.MAX_VALUE;
            }
            dividend += Math.abs(divisor);
        }

        if (divisor == Integer.MIN_VALUE){
            return res;
        }

        boolean isNeg = ((dividend ^ divisor) >>> 31 == 1) ? true : false;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int c = 0;
        while (divisor <= (dividend >> 1)) {
            divisor <<= 1;
            c++;
        }

        while (c >= 0) {
            if (dividend >= divisor) {
                dividend -= divisor;
                res += 1 << c;
            }
            divisor >>= 1;
            c--;
        }

        return isNeg ? -res : res;
    }
}
