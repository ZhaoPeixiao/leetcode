package page6.studentattendancerecordi;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean checkRecord(String s) {
        int A = 0;
        int L = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                A++;
                if (A >= 2) {
                    return false;
                }
                L = 0;
            } else if (s.charAt(i) == 'L') {
                L++;
                if (L > 2) {
                    return false;
                }
            } else {
                L = 0;
            }
        }
        return true;
    }
}
