package array.searcha2dmatrix;

/**
 * @author Peixiao Zhao
 * @date 2020/9/19 16:34
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length <= 0) return false;
        int mx = matrix.length;
        int my = matrix[0].length;

        int l = 0;
        int r = mx * my;
        while (l < r){
            int m = l + (r - l) / 2;
            int x = m / my;
            int y = m % my;
            if (matrix[x][y] == target){
                return true;
            }
            else if (matrix[x][y] < target){
                l = m + 1;
            }
            else{
                r = m;
            }
        }
        return false;
    }
}
