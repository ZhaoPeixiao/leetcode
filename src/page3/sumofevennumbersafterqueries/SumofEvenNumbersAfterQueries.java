package page3.sumofevennumbersafterqueries;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sumEven = 0;
        for (int num : A) {
            if (num % 2 == 0) sumEven += num;
        }
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (queries[i][0] % 2 == 0) {
                if (A[queries[i][1]] % 2 == 0) {
                    sumEven += queries[i][0];
                    res[i] = sumEven;
                } else res[i] = sumEven;
            } else {
                if (A[queries[i][1]] % 2 != 0) {
                    sumEven += A[queries[i][1]] + queries[i][0];
                    res[i] = sumEven;
                } else {
                    sumEven -= A[queries[i][1]];
                    res[i] = sumEven;
                }
            }
            A[queries[i][1]] += queries[i][0];
        }
        return res;
    }
}
