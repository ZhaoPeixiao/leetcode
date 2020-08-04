package page2.minimumabsolutedifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i ++){
            min = Math.min(min, arr[i + 1] - arr[i]);
        }
        for (int i  =0; i < arr.length - 1; i ++){
            if (arr[i + 1] - arr[i] == min) {
                res.add(List.of(arr[i], arr[i + 1]));
            }
        }
        return res;
    }
}
