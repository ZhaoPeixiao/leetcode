package page6.reversestringii;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2*k){
            int start = i, end = Math.min(i + k - 1, c.length - 1);
            while (start < end){
                char tmp = c[start];
                c[start ++] = c[end];
                c[end --] = tmp;
            }
        }
        return String.valueOf(c);
    }
}
