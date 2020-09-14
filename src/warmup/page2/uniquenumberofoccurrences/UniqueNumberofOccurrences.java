package warmup.page2.uniquenumberofoccurrences;

import java.util.*;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer i : map.keySet()){
            if (!set.add(map.get(i))) {
                return false;
            }
        }
        return true;
    }
}
