package warmup.page2.projectionareaof3dshapes;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int projectionArea(int[][] grid) {
        int sum = 0;
        for(int i = 0; i < grid.length; i++) {
            int maxCol = 0;
            int maxRow = 0;
            for(int j = 0; j < grid.length; j++) {
                if(grid[i][j] > 0) sum++;
                maxCol = Math.max(maxCol, grid[j][i]);
                maxRow = Math.max(maxRow, grid[i][j]);
            }
            sum += maxCol + maxRow;
        }
        return sum;
    }
}
