package page1.maketwoarraysequalbyreversingsubarrays;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
