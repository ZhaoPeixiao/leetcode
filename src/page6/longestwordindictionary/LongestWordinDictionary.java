package page6.longestwordindictionary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String res = "";
        Set<String> set = new HashSet<>();
        for(int i=0; i<words.length; i++) {
            if(words[i].length() == 1 || set.contains(words[i].substring(0, words[i].length() - 1))) {
                if(words[i].length() > res.length())
                    res = words[i];
                set.add(words[i]);
            }
        }
        return res;
    }
}
