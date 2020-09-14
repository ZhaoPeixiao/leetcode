package warmup.page1.cellswithoddvaluesinamatrix;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int res = 0;
        int[] row = new int[n];
        int[] column = new int[m];
        for (int i = 0; i < indices.length; i ++){
            row[indices[i][0]] ++;
            column[indices[i][1]] ++;
        }
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j ++){
                if ((row[i] + column[j]) % 2 != 0){
                    res ++;
                }
            }
        }
        return res;
    }
}
