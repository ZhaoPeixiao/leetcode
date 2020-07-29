package page1.countnegativenumbersinasortedmatrix;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int count = 0;

        int rowIdx = row - 1;
        int colIdx = 0;

        while (rowIdx != -1) {
            while (colIdx != col && grid[rowIdx][colIdx] >= 0) {
                colIdx++;
            }
            count += col - colIdx;
            rowIdx--;
        }

        return count;
    }
}