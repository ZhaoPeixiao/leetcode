package page3.transposematrix;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[][] transpose(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] res = new int[cols][rows]; //just swap rows and cols heare and in loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                res[j][i] = A[i][j];
        }
        return res;
    }
}
