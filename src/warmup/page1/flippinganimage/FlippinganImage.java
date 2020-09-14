package warmup.page1.flippinganimage;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int k;
        int[][] arr = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            k = 0;
            for (int j = A.length - 1; j >= 0; j--) {
                if (A[i][j] == 1)
                    arr[i][k] = 0;
                else
                    arr[i][k] = 1;
                k++;
            }
        }
        return arr;
    }
}
