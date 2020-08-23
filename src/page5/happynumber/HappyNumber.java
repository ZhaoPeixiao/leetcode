package page5.happynumber;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1){
            int tmp = 0;
            while (n != 0) {
                int a = n % 10;
                n /= 10;
                tmp += a * a;
            }
            if (set.contains(tmp)) {
                return false;
            }
            set.add(tmp);
            n = tmp;
        }
        return true;
    }
}
