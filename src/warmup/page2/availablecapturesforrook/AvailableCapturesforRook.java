package warmup.page2.availablecapturesforrook;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int numRookCaptures(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        int x = 0;
        int y = 0;

        // find rook's position
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                }
            }
        }

        // search in four directions
        int count = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int[] direction : directions) {
            // tricky, can't initialize your searching position at where rook is!
            // need to move one step forward first.
            int xPos = x + direction[0];
            int yPos = y + direction[1];
            while (xPos >= 0 && xPos < m && yPos >= 0 && yPos < n) {
                if (board[xPos][yPos] == '.') {
                    xPos += direction[0];
                    yPos += direction[1];
                } else {
                    if (board[xPos][yPos] == 'p') {
                        count++;
                    }
                    break;
                }
            }
        }
        return count;
    }
}