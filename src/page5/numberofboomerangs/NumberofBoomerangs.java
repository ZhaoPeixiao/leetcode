package page5.numberofboomerangs;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int cnt = 0;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            Map<Double, Integer> track = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                double d = dist(points[i], points[j]);
                track.put(d, track.getOrDefault(d, 0) + 1);
            }
            for (int val : track.values()) {
                cnt += val * (val - 1);
            }
        }
        return cnt;
    }

    private double dist(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
}
