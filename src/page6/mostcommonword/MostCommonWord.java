package page6.mostcommonword;

import java.util.*;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] words = paragraph.split("\\W?\\s\\W?|\\W$|\\W");
        Map<String, Integer> map = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        for (String word : words){
            if (!bannedSet.contains(word)){
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());
        Collections.sort(list, (Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) -> o2.getValue() - o1.getValue());
        return list.get(0).getKey();
    }
}
