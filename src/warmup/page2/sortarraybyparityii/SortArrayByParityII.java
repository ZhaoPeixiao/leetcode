package warmup.page2.sortarraybyparityii;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0 && A[i] % 2 != 0) {
                even.add(i);
            }
            if (i % 2 != 0 && A[i] % 2 == 0) {
                odd.add(i);
            }
        }
        for (int i = 0; i < even.size(); i++) {
            int index1 = even.get(i);
            int index2 = odd.get(i);
            swap(A, index1, index2);
        }

        return A;
    }

    public void swap(int[] A, int index1, int index2) {
        int tmp = A[index1];
        A[index1] = A[index2];
        A[index2] = tmp;
    }
}

//class Solution {
//    public int[] sortArrayByParityII(int[] A) {
//        int[] res = new int[A.length];
//
//        int t = 0;
//        int k = 1;
//        for (int i = 0; i < res.length; i++) {
//            if (A[i] % 2 == 0) {
//                res[t] = A[i];
//                t += 2;
//            }
//            if (A[i] % 2 != 0) {
//                res[k] = A[i];
//                k += 2;
//            }
//        }
//
//        return res;
//    }
//
//}