package page7.validpalindromeii;

/**
 * @author Peixiao Zhao
 * @date 2020/9/6
 */
class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        char[] str = s.toCharArray();
        while (i<j){
            if (str[i] != str[j]){
                return isPalindrome(str, i, j - 1) || isPalindrome(str, i + 1, j);
            }
            i ++;
            j --;
        }
        return true;
    }


    public boolean isPalindrome(char[] str, int i, int j){
        while (i<j){
            if (str[i] != str[j]){
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }
}
