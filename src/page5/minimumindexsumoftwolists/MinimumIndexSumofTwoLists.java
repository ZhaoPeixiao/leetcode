package page5.minimumindexsumoftwolists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i ++){
            map.put(list1[i], i);
        }
        List<String> res = new ArrayList<>();
        int indexSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i ++){
            if (map.containsKey(list2[i])){
                if (i + map.get(list2[i]) < indexSum) {
                    res.clear();
                    indexSum = i + map.get(list2[i]);
                    res.add(list2[i]);
                }
                else if (i + map.get(list2[i]) == indexSum){
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
