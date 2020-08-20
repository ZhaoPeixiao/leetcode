package page5.duplicatezeros;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public void duplicateZeros(int[] arr) {
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) zeroCount++;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int k = i + zeroCount;
            if (k < arr.length) {
                arr[k] = arr[i];
            }
            if (arr[i] == 0) {
                zeroCount--;
                if (k - 1 >= 0 && k - 1 < arr.length) {
                    arr[k - 1] = 0;
                }
            }
        }
    }
}
