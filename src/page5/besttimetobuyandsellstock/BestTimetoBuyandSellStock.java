package page5.besttimetobuyandsellstock;

/**
 * @Author: Peixiao Zhao
 */

// DP

//class Solution {
//    public int maxProfit(int[] prices) {
//        if (prices.length < 2) {
//            return 0;
//        }
//        int[] dp = new int[prices.length];
//        int minPrice = prices[0];
//
//        dp[0] = 0;
//
//        for (int i = 1; i < prices.length; i ++){
//            if (prices[i] >= minPrice){
//                dp[i] = Math.max(dp[i - 1], prices[i] - minPrice);
//            }
//            else{
//                minPrice = prices[i];
//                dp[i] = dp[i - 1];
//            }
//        }
//        return dp[prices.length - 1];
//    }
//}


class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        if (prices.length < 2) {
            return 0;
        }
        for (int i = 0; i < prices.length; i ++){
            if (prices[i] < min){
                min = prices[i];
            }
            else if (profit < prices[i] - min){
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}