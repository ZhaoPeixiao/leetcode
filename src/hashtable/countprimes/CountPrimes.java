package hashtable.countprimes;

/**
 * @author Peixiao Zhao
 * @date 2020/9/22 17:01
 */
class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i * i < n; i ++){
            if (isPrime[i] == false){
                for (int j = i; i * j < n; j ++){
                    isPrime[i * j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i ++){
            if (!isPrime[i]){
                count ++;
            }
        }
        return count;
    }
}
