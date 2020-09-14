package warmup.page8.sqrtx;

/**
 * @author Peixiao Zhao
 * @date 2020/9/8
 */
class Solution {
    public int mySqrt(int x) {
        if(x == 1)
            return x;
        long start = 1;
        long end = x;
        long ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x)
                return (int)mid;
            else if (mid * mid > x)
                end = mid - 1;
            else {
                ans = mid;
                start = mid + 1;
            }
        }
        return (int)ans;
    }
}
