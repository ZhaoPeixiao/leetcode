package array.besttimetobuyandsellstockwithtransactionfee;

/**
 * @author Peixiao Zhao
 * @date 2020/9/14 17:15
 */

// DP
class Solution {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length < 2){
            return 0;
        }
        int[] hold = new int[prices.length];
        int[] sold = new int[prices.length];
        hold[0] = -prices[0];
        for (int i = 1; i < prices.length; i ++){
            hold[i] = Math.max(hold[i - 1], sold[i - 1] - prices[i]);
            sold[i] = Math.max(sold[i - 1], hold[i - 1] + prices[i] - fee);
        }
        return sold[prices.length - 1];
    }
}

// Greedy
class Solution2{
    public int maxProfit(int[] prices, int fee) {
        int profit = 0;
        Integer low = null, high = null;
        for (int i = 0; i < prices.length; i ++){
            if (low != null && high == null && prices[i] - low > fee){
                high = prices[i];
            }
            if (high != null && prices[i] > high){
                high = prices[i];
            }
            if (high != null && (high - prices[i] > fee || i == prices.length - 1)){
                profit += high - low - fee;
                high = null;
                low = null;
            }
            low = low != null? Math.min(low, prices[i]) : prices[i];
        }
        return profit;
    }
}