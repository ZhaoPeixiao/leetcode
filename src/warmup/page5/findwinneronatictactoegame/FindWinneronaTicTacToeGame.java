package warmup.page5.findwinneronatictactoegame;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String tictactoe(int[][] moves) {
        int[][] grid = new int[3][3];
        boolean aturn = true;
        int count = 0;
        for (int[] move : moves) {
            if (aturn) {
                grid[move[0]][move[1]] = 1;
                if (isOver(grid)) {
                    return "A";
                }
            } else {
                grid[move[0]][move[1]] = 2;
                if (isOver(grid)) {
                    return "B";
                }
            }
            aturn = !aturn;
            count++;
            if (count == 9)
                return "Draw";
        }
        return "Pending";
    }

    private boolean isOver(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] != 0 && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2])
                return true;
        }
        for (int j = 0; j < n; j++) {
            if (grid[0][j] != 0 && grid[0][j] == grid[1][j] && grid[1][j] == grid[2][j])
                return true;
        }
        if ((grid[1][1] != 0 && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) || (grid[1][1] != 0 && grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2]))
            return true;
        return false;
    }
}
