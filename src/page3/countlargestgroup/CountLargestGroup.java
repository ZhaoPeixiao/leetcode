package page3.countlargestgroup;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
public class CountLargestGroup {
}


class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> groups = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int group = findGroup(i);
            int prev = groups.getOrDefault(group, 0);
            groups.put(group, prev + 1);
        }

        return Collections.frequency(groups.values(), Collections.max(groups.values()));
    }

    private int findGroup(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}