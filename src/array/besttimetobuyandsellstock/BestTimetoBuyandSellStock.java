package array.besttimetobuyandsellstock;

/**
 * @author Peixiao Zhao
 * @date 2020/9/14 16:53
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1){
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int price : prices){
            lowest = Math.min(price, lowest);
            maxProfit = Math.max(maxProfit, price - lowest);
        }
        return maxProfit;
    }
}
