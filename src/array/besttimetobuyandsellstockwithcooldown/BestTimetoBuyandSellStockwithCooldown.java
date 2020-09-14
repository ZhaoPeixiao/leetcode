package array.besttimetobuyandsellstockwithcooldown;

/**
 * @author Peixiao Zhao
 * @date 2020/9/14 17:02
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0){
            return 0;
        }
        int[] sell = new int[prices.length];
        int[] coolDown = new int[prices.length];
        sell[0] = 0;
        coolDown[0] = 0;
        for (int i = 1; i < prices.length; i ++){
            sell[i] = Math.max(sell[i - 1] + prices[i] - prices[i - 1], coolDown[i - 1]);
            coolDown[i] = Math.max(sell[i - 1], coolDown[i- 1]);
        }
        return Math.max(sell[sell.length - 1], coolDown[coolDown.length - 1]);
    }
}