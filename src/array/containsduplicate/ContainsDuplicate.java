package array.containsduplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Peixiao Zhao
 * @date 2020/9/16 20:02
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            if (set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
