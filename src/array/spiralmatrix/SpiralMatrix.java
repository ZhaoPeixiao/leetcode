package array.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/9/20 14:31
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0){
            return res;
        }
        int startX = 0, endX = matrix.length - 1;
        int startY = 0, endY = matrix[0].length - 1;

        while (startX <= endX && startY <= endY){
            for (int y = startY; y <= endY; y ++){
                res.add(matrix[startX][y]);
            }
            for (int x = startX + 1; x <= endX; x ++){
                res.add(matrix[x][endY]);
            }

            if (startX == endX || startY == endY) {
                break;
            }

            for (int y = endY - 1; y >= startY; y--) {
                res.add(matrix[endX][y]);
            }

            for (int x = endX - 1; x >= startX + 1; x--) {
                res.add(matrix[x][startY]);
            }

            startX ++;
            startY ++;
            endX --;
            endY --;
        }
        return res;
    }
}
