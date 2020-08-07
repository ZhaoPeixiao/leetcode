package page3.playwithchips;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int minCostToMoveChips(int[] chips) {
        int even = 0, odd = 0;
        for(int n : chips){
            if (n % 2 == 0) {
                odd ++;
            }
            else{
                even ++;
            }
        }

        return Math.min(odd, even);
    }
}
