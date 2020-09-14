package warmup.page3.matrixcellsindistanceorder;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[] count = new int[R + C + 1];

        for (int r = 0; r < R; r++)
            for (int c = 0; c < C; c++) {
                int man = Math.abs(r - r0) + Math.abs(c - c0);
                count[man + 1]++;
            }


        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        int[][] ans = new int[R * C][2];


        for (int r = 0; r < R; r++)
            for (int c = 0; c < C; c++) {
                int man = Math.abs(r - r0) + Math.abs(c - c0);
                ans[count[man]] = new int[]{r, c};
                count[man]++;
            }

        return ans;

    }
}
