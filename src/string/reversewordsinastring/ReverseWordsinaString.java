package string.reversewordsinastring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/9/29 17:57
 */
class Solution {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split(" +"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
