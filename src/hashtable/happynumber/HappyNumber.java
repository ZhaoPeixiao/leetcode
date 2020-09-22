package hashtable.happynumber;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Peixiao Zhao
 * @date 2020/9/22 17:30
 */
class Solution {
    public boolean isHappy(int n) {
        if (n < 1){
            return false;
        }
        if (n == 1){
            return true;
        }
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while (true){
            int s = 0;
            while (n > 0){
                s += (n % 10) * (n % 10);
                n /= 10;
            }
            if (s == 1){
                return true;
            } else if (set.contains(s)) {
                return false;
            }
            set.add(s);
            n = s;
        }
    }
}