package warmup.page4.excelsheetcolumnnumber;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        char[] chars = s.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            res += (((int) chars[i]) - 96) * Math.pow(26, chars.length - i - 1);
        }

        return res;
    }
}
