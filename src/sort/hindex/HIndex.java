package sort.hindex;

import java.util.Arrays;

/**
 * @author Peixiao Zhao
 * @date 2020/10/11 15:14
 */
class Solution {
    public int hIndex(int[] citations) {
        if (citations == null) {
            return 0;
        }

        int h = 0, n = citations.length;
        Arrays.sort(citations);
        for (int i = n - 1; i >= 0; i --){
            if (citations[i] >= n - i){
                h = n - i;
            }else {
                break;
            }
        }

        return h;
    }
}

