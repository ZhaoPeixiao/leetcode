package warmup.page6.findsmallestlettergreaterthantarget;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char temp = letters[0];
        for (int k = 0; k < letters.length; k++) {
            if (letters[k] > target) {
                temp = letters[k];
                break;
            }
        }
        return temp;
    }
}