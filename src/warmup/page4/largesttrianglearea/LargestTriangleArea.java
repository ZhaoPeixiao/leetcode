package warmup.page4.largesttrianglearea;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int i = 0; i < points.length; i -= -1) {
            for (int j = i + 1; j < points.length; j -= -1) {
                for (int k = j + 1; k < points.length; k -= -1) {
                    double temp = (double) Math.abs(((points[i][0] * (points[j][1] - points[k][1])) + points[j][0] * (points[k][1] - points[i][1]) + points[k][0] * (points[i][1] - points[j][1]))) / 2;
                    res = Math.max(res, temp);
                }
            }
        }
        return res;
    }
}
