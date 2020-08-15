package page4.convertintegertothesumoftwonozerointegers;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i <= n / 2; i ++){
            if (check(i) && check(n - i)) {
                return new int[]{i, n - i};
            }
        }
        return null;
    }


    public boolean check(int a){
        while (a >= 10) {
            if (a % 10 == 0){
                return false;
            }
            a = a / 10;
        }
        return true;
    }
}
