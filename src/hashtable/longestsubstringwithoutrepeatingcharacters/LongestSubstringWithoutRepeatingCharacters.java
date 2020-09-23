package hashtable.longestsubstringwithoutrepeatingcharacters;

/**
 * @author Peixiao Zhao
 * @date 2020/9/23 16:06
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() == 0 || s.length() == 1){
            return s.length();
        }

        char[] c = s.toCharArray();

        int barrier = 0;
        int maxLen = 1;
        for (int i = 1; i < c.length; i ++){
            for (int j = i - 1; j >= barrier; j --){
                if (c[i] == c[j]){
                    barrier = j + 1;
                    break;
                }
            }
            maxLen = Math.max(maxLen, i - barrier + 1);
        }
        return maxLen;
    }
}
