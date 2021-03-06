package dynamicprogramming.perfectsquares;

import java.util.Arrays;

/**
 * @author Peixiao Zhao
 * @date 2020/10/4 15:39
 */
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for (int i = 0; i * i <= n; i++) {
            dp[i * i] = 1;
        }
        for (int a = 1; a <= n; a++) {
            for (int b = 1; a + b * b <= n; b++) {

                dp[a + b * b] = Math.min(dp[a] + 1, dp[a + b * b]);
            }
        }
        return dp[n];
    }
}
