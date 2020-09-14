package warmup.page5.primearrangements;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int numPrimeArrangements(int n) {
        int mod = 1000000007;
        long cnt = 1;
        int prime = 0;
        int nprime = 0;
        for (int i = 1; i <= n; ++i) {
            if (!isPrime(i)) {
                ++nprime;
                cnt = cnt * nprime % mod;
            } else {
                ++prime;
                cnt = cnt * prime % mod;
            }
        }
        return (int)cnt;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i*i <= n; ++i)
            if (n % i == 0) return false;
        return true;
    }
}
