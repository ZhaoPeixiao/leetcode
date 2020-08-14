package page4.besttimetobuyandsellstockii;


/**
 * @Author: Peixiao Zhao
 */
//class Solution {
//    public int maxProfit(int[] prices) {
//        int[] dp = new int[prices.length];
//        int max = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            dp[i] = Math.max(max, prices[i] + dp[i - 1]);
//            max = Math.max(max, prices[i] + dp[i - 1]);
//        }
//        return dp[dp.length - 1];
//    }
//}


class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                maxProfit += (prices[i] - prices[i - 1]);
            }
        }
        return maxProfit;
    }
}