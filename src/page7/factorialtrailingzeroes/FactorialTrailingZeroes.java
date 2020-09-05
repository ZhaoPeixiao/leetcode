package page7.factorialtrailingzeroes;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
