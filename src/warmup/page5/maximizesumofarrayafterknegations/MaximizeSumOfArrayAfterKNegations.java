package warmup.page5.maximizesumofarrayafterknegations;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0, i = 0, index = 0;
        while (K -- > 0){
            index = i;
            if (A[i] > A[i + 1]){
                i ++;
                index = i;
            }
            A[index] = -A[index];
        }

        for (int a : A){
            sum += a;
        }
        return sum;
    }
}
