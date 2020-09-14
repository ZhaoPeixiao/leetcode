package warmup.page3.stringmatchinginanarray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].contains(words[j])){
                    set.add(words[j]);
                }
                if (words[j].contains(words[i])){
                    set.add(words[i]);
                }
            }
        }

        return new ArrayList<>(set);
    }
}
