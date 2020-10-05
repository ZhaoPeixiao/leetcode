package dynamicprogramming.uniquebinarysearchtrees;

/**
 * @author Peixiao Zhao
 * @date 2020/10/5 19:46
 */
class Solution {
    public int numTrees(int n) {
        if (n == 1 || n == 2){
            return n;
        }

        int[] record = new int[n + 1];
        record[0] = 1;
        record[1] = 1;
        record[2] = 2;

        for (int i = 3; i <= n; i ++){
            int tmp = 0;
            for (int k = 0; k < i; k ++){
                tmp += (record[k] * record[i - k - 1]);
            }
            record[i] = tmp;
        }

        return record[n];
    }
}
