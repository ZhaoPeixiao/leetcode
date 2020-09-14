package warmup.page2.subdomainvisitcount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();

        Pattern pattern = Pattern.compile("(\\d+)\\s(\\w+\\.(\\w+(?:\\.(\\w+))?))");
        Matcher matcher;

        for(String s  : cpdomains) {
            matcher = pattern.matcher(s);
            matcher.matches();

            int visits = Integer.valueOf(matcher.group(1));
            for (int i = 2; i < 5; i++) {
                String key = matcher.group(i);
                if(key != null) { //4th group can be absent
                    map.put(key, map.getOrDefault(key, 0) + visits);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            result.add(e.getValue() + " " + e.getKey());
        }

        return result;
    }
}
