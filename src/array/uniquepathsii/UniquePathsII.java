package array.uniquepathsii;

/**
 * @author Peixiao Zhao
 * @date 2020/9/20 14:57
 */
class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int m = ob.length;
        if (m == 0) return 0;
        int n = ob[0].length;
        if (ob[m - 1][n - 1] == 1 || ob[0][0] == 1) return 0;

        int[][] dp = new int[m][n];
        if (ob[0][0] != 1) dp[0][0] = 1;
        for (int i = 1; i < m; i++) {
            if (ob[i][0] == 1) dp[i][0] = 0;
            else dp[i][0] = 1 * dp[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            if (ob[0][i] == 1) dp[0][i] = 0;
            else dp[0][i] = 1 * dp[0][i - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (ob[i - 1][j] != 1 && ob[i][j - 1] != 1) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else if (ob[i - 1][j] == 1 && ob[i][j - 1] == 1) {
                    dp[i][j] = 0;
                } else if (ob[i - 1][j] == 1) {
                    dp[i][j] = dp[i][j - 1];
                } else if (ob[i][j - 1] == 1) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
