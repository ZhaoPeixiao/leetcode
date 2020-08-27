package page6.pairsofsongswithtotaldurationsdivisibleby60;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] map = new int[60];
        int count = 0;

        for (int i = 0; i <time.length; i ++){
            time[i] %= 60;

            if (map[(60 - time[i]) % 60] > 0) {
                count += map[(60-time[i])%60];
            }
            map[time[i]]++;
        }
        return count;
    }
}
