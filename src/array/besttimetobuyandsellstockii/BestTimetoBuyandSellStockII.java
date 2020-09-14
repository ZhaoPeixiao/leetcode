package array.besttimetobuyandsellstockii;

/**
 * @author Peixiao Zhao
 * @date 2020/9/14 16:57
 */
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i ++){
            if (prices[i - 1] < prices[i]){
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
}
