package page2.luckynumbersinamatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i ++){
            int minR = Integer.MAX_VALUE;
            int minRIndex = 0;
            for (int j = 0; j < matrix[i].length; j ++){
                if (minR > matrix[i][j]){
                    minR = matrix[i][j];
                    minRIndex = j;
                }
            }
            int maxC = 0;
            for (int j = 0; j < matrix.length; j ++){
                maxC = Math.max(maxC, matrix[j][minRIndex]);
            }
            if (minR == maxC){
                res.add(minR);
            }
        }
        return res;
    }
}
