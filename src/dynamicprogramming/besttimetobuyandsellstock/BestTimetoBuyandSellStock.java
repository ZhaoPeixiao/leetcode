package dynamicprogramming.besttimetobuyandsellstock;

/**
 * @author Peixiao Zhao
 * @date 2020/10/3 17:18
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1){
            return 0;
        }

        int maxProfit = 0;
        int lowest = Integer.MAX_VALUE;

        for (int v : prices){
            lowest = Math.min(v, lowest);
            maxProfit = Math.max(maxProfit, v - lowest);
        }

        return maxProfit;
    }
}
