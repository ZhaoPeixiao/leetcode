package page4.longestuncommonsubsequencei;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findLUSlength(String a, String b) {
        if(a.length() != b.length()) return Math.max(a.length(), b.length());
        return !a.equals(b) ? a.length() : -1;
    }
}
