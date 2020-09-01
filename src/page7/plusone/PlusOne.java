package page7.plusone;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int tmp = digits[digits.length - 1] + 1;
        boolean flag = tmp == 10;
        if (!flag){
            digits[digits.length - 1] += 1;
            return digits;
        }
        for (int i = digits.length - 1; i >= 0 && flag; i --){
            if (digits[i] + 1 < 10){
                digits[i] += 1;
                flag = false;
            }
            else{
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}
