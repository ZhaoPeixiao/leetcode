package minimumtimevisitingallpoints;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 1; i < points.length; i ++){
            int diffX = points[i][0] - points[i - 1][0];
            int diffY = points[i][1] - points[i - 1][1];
            res += Math.max(Math.abs(diffX),Math.abs(diffY));
        }
        return res;
    }
}
