package page5.detectcapital;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        int c = 0;
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < word.length(); i ++){
            if (Character.isUpperCase(word.charAt(i))){
                c ++;
                index = i;
            }
        }
        return c == word.length() || (c == 1 && index == 0) || c == 0;
    }
}
