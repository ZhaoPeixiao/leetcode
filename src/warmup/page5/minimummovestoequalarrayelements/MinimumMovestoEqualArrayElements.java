package warmup.page5.minimummovestoequalarrayelements;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i : nums){
            sum += i;
            min = Math.min(i, min);
        }
        return sum - min * nums.length;
    }
}
