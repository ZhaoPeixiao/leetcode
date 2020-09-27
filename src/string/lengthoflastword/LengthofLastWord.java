package string.lengthoflastword;

/**
 * @author Peixiao Zhao
 * @date 2020/9/27 13:27
 */
class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }

        int len = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i --;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            len ++;
            i --;
        }
        return len;
    }
}
