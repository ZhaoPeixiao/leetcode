package warmup.page3.uncommonwordsfromtwosentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] strings1 = A.split(" ");
        String[] strings2 = B.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings1) {
            if (map.containsKey(s)) {
                map.put(s, 0);
            } else {
                map.put(s, 1);
            }
        }
        for (String s : strings2) {
            if (map.containsKey(s)) {
                map.put(s, 0);
            } else {
                map.put(s, 1);
            }
        }
        List<String> candidates = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                candidates.add(key);
            }
        }
        String[] res = new String[candidates.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = candidates.get(i);
        }
        return res;
    }
}
