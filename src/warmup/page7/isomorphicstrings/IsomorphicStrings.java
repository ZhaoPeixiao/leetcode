package warmup.page7.isomorphicstrings;

import java.util.HashMap;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sChars = s.toCharArray();
        HashMap<Character,Character> map = new HashMap<>();
        char[] tChars = t.toCharArray();
        for (int i = 0; i <s.length(); i ++){
            if (map.containsKey(sChars[i])){
                if (map.get(sChars[i]) != tChars[i]){
                    return false;
                }
            }
            else{
                if (map.containsValue(tChars[i])) {
                    return false;
                }
                else{
                    map.put(sChars[i], tChars[i]);
                }
            }
        }
        return true;
    }
}
