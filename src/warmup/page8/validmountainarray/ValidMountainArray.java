package warmup.page8.validmountainarray;

/**
 * @author Peixiao Zhao
 * @date 2020/9/9
 */
class Solution {
    public boolean validMountainArray(int[] A) {
        int l = A.length, descend = 0, ascend = 0;
        if (l < 3)
            return false;
        for (int i = 1; i < l; i++) {
            if (A[i] > A[i - 1] && descend == 0)
                ascend++;
            else if (A[i] < A[i - 1] && ascend > 0) {
                descend++;
            }
            else {
                return false;
            }
        }
        if (descend > 0 && ascend > 0)
            return true;
        else
            return false;
    }
}
