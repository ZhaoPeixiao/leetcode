package page6.palindromenumber;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }
        int res = 0;
        int t = x;
        while(t != 0){
            res = res * 10 + t % 10;
            t /= 10;
        }
        return res == x;
    }
}
