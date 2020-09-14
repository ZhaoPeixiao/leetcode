package warmup.page3.keyboardrow;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<String>();
        String top = "qwertyuiop", mid = "asdfghjkl", bot = "zxcvbnm";
        String letters;
        for (String word : words){
            if (top.indexOf(Character.toLowerCase(word.charAt(0))) > -1) {
                letters = top;
            } else if (mid.indexOf(Character.toLowerCase(word.charAt(0))) > -1) {
                letters = mid;
            } else{
                letters = bot;
            }

            for (int i = 0; i < word.length(); i ++){
                if (letters.indexOf(Character.toLowerCase(word.charAt(i))) < 0) {
                    break;
                }
                if (i == word.length() - 1) {
                    list.add(word);
                }
            }
        }

        final String[] result = new String[list.size()];
        int k = 0;
        for (String str : list) {
            result[k++] = str;
        }
        return result;
    }
}
