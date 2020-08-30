package page6.checkifitisastraightline;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2){
            return true;
        }

        int x = coordinates[1][0] - coordinates[0][0];
        int y = coordinates[1][1] - coordinates[0][1];

        int currX = 0, currY = 0;

        for (int i = 2; i < coordinates.length; i ++){
            currX = coordinates[i][0] - coordinates[i - 1][0];
            currY = coordinates[i][1] - coordinates[i - 1][1];

            if (y * currX != x * currY){
                return false;
            }
        }
        return true;
    }
}
