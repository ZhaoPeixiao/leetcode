package page3.consecutivecharacters;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int maxPower(String s) {
        int max = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}

