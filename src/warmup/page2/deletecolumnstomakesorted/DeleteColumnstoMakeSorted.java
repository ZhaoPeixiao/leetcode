package warmup.page2.deletecolumnstomakesorted;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int minDeletionSize(String[] A) {
        int wordLength = A[0].length();
        int deletionCount = 0;
        for (int i = 0; i < wordLength; i++) {
            if (!isNonDecreasing(A, i)) {
                deletionCount++;
            }
        }
        return deletionCount;
    }

    private boolean isNonDecreasing(String[] A, int index) {
        int max = 0;
        for (int j = 0; j < A.length; j++) {
            if ((A[j].charAt(index) - 'a') < max) {
                return false;
            } else {
                max = A[j].charAt(index) - 'a';
            }
        }
        return true;
    }
}
