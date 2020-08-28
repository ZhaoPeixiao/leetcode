package page6.base7;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String convertToBase7(int num) {
        int tmp = num, i = 0;
        int x = 0;

        while (tmp != 0) {
            x += tmp % 7 * Math.pow(10, i);
            tmp = tmp / 7;
            i ++;
        }

        return String.valueOf(x);
    }
}
