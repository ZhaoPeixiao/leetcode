package warmup.page1.destinationcity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i <paths.size(); i ++){
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        String res = paths.get(0).get(1);
        while (map.containsKey(res)) {
            res = map.get(res);
        }
        return res;
    }
}
