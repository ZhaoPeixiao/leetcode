package warmup.page6.addtoarrayformofinteger;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> res = new LinkedList<>();
        int carry = 0;
        for (int i = A.length - 1; i >=0 || carry > 0 || K > 0; i --){
            carry += (i >=0 ? A[i] : 0) + K % 10;
            K /= 10;
            res.addFirst(carry % 10);
            carry /= 10;
        }
        return res;
    }
}
