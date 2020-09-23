package hashtable.wordpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Peixiao Zhao
 * @date 2020/9/23 16:22
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null){
            return false;
        }
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length){
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i ++){
            char c = pattern.charAt(i);

            if (map.containsKey(c)){
                if (!map.get(c).equals(strs[i])){
                    return false;
                }
            }else{
                if (map.containsValue(strs[i])){
                    return false;
                }
                map.put(c, strs[i]);
            }
        }
        return true;
    }
}
