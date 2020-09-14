package warmup.page4.ranktransformofanarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i ++){
            copyArr[i] = arr[i];
        }
        Arrays.sort(copyArr);
        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : copyArr){
            if (!map.containsKey(num)){
                map.put(num, rank);
                rank ++;
            }
        }
        for (int i = 0; i < arr.length; i ++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
