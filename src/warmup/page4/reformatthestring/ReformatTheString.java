package warmup.page4.reformatthestring;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String reformat(String s) {
        int countD = 0, countL = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9')
                countD++;
            else
                countL++;
        }

        if (Math.abs(countD - countL) > 1)
            return "";

        char[] res = new char[s.length()];
        int p = 0, q = 1;
        if (countL > countD) {
            p = 1;
            q = 0;
        }

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                res[p] = c;
                p += 2;
            } else {
                res[q] = c;
                q += 2;
            }
        }
        return String.valueOf(res);
    }
}
