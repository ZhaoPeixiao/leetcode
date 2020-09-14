package warmup.page6.addstrings;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int res = 0;

        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0 && j >=0){
            int c1 = num1.charAt(i) - '0';
            int c2 = num2.charAt(j) - '0';

            int total = c1 + c2 + res;
            if (total > 9){
                stringBuilder.insert(0, total % 10);
                res = total / 10;
            }
            else {
                stringBuilder.insert(0, total);
                res = 0;
            }
            i --;
            j --;
        }

        while (i >= 0){
            int c1 = num1.charAt(i) - '0';
            int total = c1 + res;
            if (total > 9) {
                stringBuilder.insert(0, total % 10);
                res = total / 10;
            } else {
                stringBuilder.insert(0, total);
                res = 0;
            }
            i--;
        }

        while (j >= 0){
            int c2 = num2.charAt(j) - '0';
            int total = c2 + res;
            if (total > 9) {
                stringBuilder.insert(0, total % 10);
                res = total / 10;
            } else {
                stringBuilder.insert(0, total);
                res = 0;
            }
            j--;
        }

        if (res > 0) {
            stringBuilder.insert(0, res);
        }

        return stringBuilder.toString();
    }
}
