package hashtable.hindexii;

import java.util.Arrays;

/**
 * @author Peixiao Zhao
 * @date 2020/9/22 17:23
 */
class Solution {
    public int hIndex(int[] citations) {
        if (citations == null){
            return 0;
        }
        int h = 0, n = citations.length;
        Arrays.sort(citations);

        for (int i = n - 1; i >= 0; i --){
            if (citations[i] >= n - i){
                h = n - i;
            }
            else{
                break;
            }
        }
        return h;
    }
}
