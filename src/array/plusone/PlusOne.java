package array.plusone;

import java.util.Arrays;

/**
 * @author Peixiao Zhao
 * @date 2020/9/18 17:39
 */
class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0){
            return null;
        }

        int[] res = new int[digits.length + 1];
        digits[digits.length - 1] ++;
        for (int i = digits.length - 1; i >= 0; i --){
            res[i + 1] += digits[i];
            res[i] += res[i + 1] / 10;
            res[i + 1] %= 10;
        }

        if (res[0] == 0){
            return Arrays.copyOfRange(res, 1, res.length);
        }
        else {
            return res;
        }
    }
}
