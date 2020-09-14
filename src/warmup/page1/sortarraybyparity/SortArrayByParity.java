package warmup.page1.sortarraybyparity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i : A){
            if (i % 2 == 0) {
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }
        even.addAll(odd);
        int[] res = new int[A.length];
        for (int i = 0; i < even.size(); i ++){
            res[i] = even.get(i);
        }
        return res;
    }
}
