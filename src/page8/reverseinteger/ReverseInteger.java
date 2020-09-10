package page8.reverseinteger;

/**
 * @author Peixiao Zhao
 * @date 2020/9/10
 */
class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if (x < 0){
            neg = true;
            x = x * -1;
        }
        long op = 0;
        while (x > 0){
            int reminder = x % 10;
            x /= 10;
            op = op * 10;
            op = (op + reminder);
        }
        if (op > Integer.MAX_VALUE){
            return 0;
        }
        return neg? (int)op * -1 : (int)op;
    }
}
