package page2.findwordsthatcanbeformedbycharacters;

import java.util.HashMap;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        int count = 0;
        for(String word: words) {
            HashMap<Character, Integer> fMap = (HashMap<Character, Integer>)map.clone();

            boolean isGoodWord = true;
            for(char c : word.toCharArray()) {
                if(!fMap.containsKey(c)) {
                    isGoodWord = false;
                    break;
                }

                int n = fMap.get(c);
                if(n == 1) fMap.remove(c);
                else fMap.put(c, n-1);
            }
            if(isGoodWord) count += word.length();
        }
        return count;
    }
}
