package warmup.page5.longestpalindrome;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray())
            count[c]++;
        int palindromeLength = 0;
        for (int char_count : count) {
            palindromeLength += char_count / 2 * 2;
            if (palindromeLength % 2 == 0 && char_count % 2 == 1)
                palindromeLength++;
        }
        return palindromeLength;
    }
}
