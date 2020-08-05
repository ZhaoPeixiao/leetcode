package page3.islandperimeter;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perim = 4;
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[i].length; k++) {
                if (grid[i][k] == 1) {
                    if (k > 0 && grid[i][k - 1] != 0) {
                        perim--;
                    }
                    if (k < grid[i].length - 1 && grid[i][k + 1] != 0) {
                        perim--;
                    }
                    if (i > 0 && grid[i - 1][k] != 0) {
                        perim--;
                    }
                    if (i < grid.length - 1 && grid[i + 1][k] != 0) {
                        perim--;
                    }
                    sum += perim;
                    perim = 4;
                }
            }
        }
        return sum;
    }
}
