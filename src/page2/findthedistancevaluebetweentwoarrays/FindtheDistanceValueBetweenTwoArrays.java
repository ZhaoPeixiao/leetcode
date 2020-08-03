package page2.findthedistancevaluebetweentwoarrays;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;

        Arrays.sort(arr2);

        for (int num : arr1) {

            int lo = 0;
            int hi = arr2.length - 1;

            while (lo <= hi) {

                int mid = lo + (hi - lo) / 2;
                if (arr2[mid] >= num) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            // Need to check edge cases, where lo < 0 or hi > arr.length - 1
            boolean left = hi < 0 ? true : num - arr2[hi] > d;
            boolean right = lo >= arr2.length ? true : arr2[lo] - num > d;
            if (left && right) {
                count++;
            }
        }

        return count;
    }
}
