package warmup.page8.countprimes;

/**
 * @author Peixiao Zhao
 * @date 2020/9/10
 */
class Solution {
    public int countPrimes(int n) {
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i ++){
            if (!visited[i]){
                count ++;
                for (int j = 2; i * j < n; j ++){
                    visited[i*j] = true;
                }
            }
        }
        return count;
    }
}
