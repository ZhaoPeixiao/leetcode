package warmup.page7.wordpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Peixiao Zhao
 * @date 2020/9/6
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        int n = pattern.length();
        Map<Character, String> dict = new HashMap<>();
        if (n != words.length){
            return false;
        }
        for (int i = 0; i < n; i ++){
            char key = pattern.charAt(i);
            String value = words[i];
            if (!dict.containsKey(key)){
                if (!dict.values().contains(value)) {
                    dict.put(key, value);
                }
                else{
                    return false;
                }
            }else if (!dict.get(key).equals(value)){
                return false;
            }
        }
        return true;
    }
}
