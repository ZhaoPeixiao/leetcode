package page4.surfaceareaof3dshapes;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int surfaceArea(int[][] grid) {
        int length = grid.length;
        if (length < 1) return 0;
        int breadth = grid[0].length;

        int area = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < breadth; j++) {
                // top and down
                if (grid[i][j] > 0) {
                    area += 2;
                }

                // left
                if (i == 0) area += grid[i][j];
                else if (grid[i - 1][j] < grid[i][j]) {
                    area += grid[i][j] - grid[i - 1][j];
                }

                //right
                if (i == length - 1) area += grid[i][j];
                else if (grid[i][j] > grid[i + 1][j]) {
                    area += grid[i][j] - grid[i + 1][j];
                }

                // front
                if (j == 0) area += grid[i][j];
                else if (grid[i][j] > grid[i][j - 1]) {
                    area += grid[i][j] - grid[i][j - 1];
                }

                // back
                if (j == breadth - 1) area += grid[i][j];
                else if (grid[i][j] > grid[i][j + 1]) {
                    area += grid[i][j] - grid[i][j + 1];
                }
            }
        }

        return area;
    }
}
