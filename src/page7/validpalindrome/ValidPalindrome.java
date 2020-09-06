package page7.validpalindrome;

/**
 * @author Peixiao Zhao
 * @date 2020/9/6
 */
class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        char[] ch = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c))
                ch[k++] = (char) Character.toLowerCase(c);
        }
        int st = 0;
        int end = k - 1;
        while (st < end) {
            if (ch[st] != ch[end])
                return false;
            st++;
            end--;
        }
        return true;
    }
}
