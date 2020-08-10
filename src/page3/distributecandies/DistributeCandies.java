package page3.distributecandies;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int distributeCandies(int[] candies) {
        int half = candies.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int n : candies){
            set.add(n);
            if (set.size() >= half){
                return half;
            }
        }
        return set.size();
    }
}
