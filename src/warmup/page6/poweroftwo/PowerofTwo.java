package warmup.page6.poweroftwo;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        return check(n);
    }

    public boolean check(int n){
        if (n == 2){
            return true;
        }
        if (n > 2 && n % 2 == 0){
            return check(n / 2);
        }
        return false;
    }
}
