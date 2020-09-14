package warmup.page1.uniquemorsecodewords;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    private static final String[] encodings = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> differentEncodings = new HashSet<>();

        for (String word : words) {
            differentEncodings.add(encode(word));
        }

        return differentEncodings.size();
    }

    private String encode(String word) {
        StringBuilder encoding = new StringBuilder();

        for (int idx = 0; idx < word.length(); idx++) {
            char cur = word.charAt(idx);
            encoding.append(encodings[cur - 'a']);
        }

        return encoding.toString();
    }
}
