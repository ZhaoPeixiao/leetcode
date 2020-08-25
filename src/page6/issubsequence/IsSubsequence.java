package page6.issubsequence;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0, k = 0;
        for (int i = 0; i < t.length(); i ++){
            if (s.length() > k && s.charAt(k) == t.charAt(i)){
                j ++;
                k ++;
            }
        }
        return j == s.length();
    }
}
