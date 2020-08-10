package page3.shift2dgrid;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> shiftedGrid = new ArrayList<>();

        int rows = grid.length, cols = grid[0].length;
        int gridSize = rows * cols;

        k = (gridSize - (k % gridSize)) % gridSize;
        int row = k / cols;
        int col = k % cols;

        for (int rowCount = 0; rowCount < rows; rowCount++) {
            List<Integer> shiftedList = new ArrayList<>();

            for (int colCount = 0; colCount < cols; colCount++) {
                shiftedList.add(grid[row][col]);

                col = (col + 1) % cols;
                if (col == 0) {
                    row = (row + 1) % rows;
                }
            }

            shiftedGrid.add(shiftedList);
        }

        return shiftedGrid;
    }
}
