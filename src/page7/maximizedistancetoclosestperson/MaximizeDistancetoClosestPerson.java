package page7.maximizedistancetoclosestperson;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int maxDistToClosest(int[] seats) {
        int i = -seats.length, j, res = 0;
        for (j = 0; j < seats.length && seats[j] != 1; ++j) ;
        for (int k = 0; k < seats.length; ++k) {
            if (k != j) res = Math.max(Math.min(j - k, k - i), res);
            else {
                i = j;
                for (j = j + 1; j < seats.length && seats[j] != 1; ++j) ;
                j = j == seats.length ? 2 * j : j;
            }
        }
        return res;
    }
}
