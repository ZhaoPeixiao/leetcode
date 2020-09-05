package page7.checkifnanditsdoubleexist;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> container = new HashSet<>();
        for (int i : arr) {
            if (container.contains(i * 2) || (i % 2 == 0 && container.contains(i / 2))) {
                return true;
            } else {
                container.add(i);
            }
        }
        return false;
    }
}
