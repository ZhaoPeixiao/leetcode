package warmup.page3.occurrencesafterbigram;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> tmp = new ArrayList<>();
        String[] texts = text.split(" ");
        for (int i = 0; i < texts.length - 2; i ++){
            if (texts[i].equals(first) && texts[i + 1].equals(second)) {
                tmp.add(texts[i + 2]);
            }
        }
        final String[] result = new String[tmp.size()];
        int k = 0;
        for (String str : tmp) {
            result[k++] = str;
        }
        return result;
    }
}
