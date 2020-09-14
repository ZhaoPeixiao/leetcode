package warmup.page3.waterbottles;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        int left = numBottles;
        while (left >= numExchange) {
            res += (left / numExchange);
            left = (left / numExchange) + (left % numExchange);
        }
        return res;
    }
}
