package warmup.page2.relativesortarray;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        if (null == arr1 || arr1.length <= 0 || null == arr2 || arr2.length <= 0) {
            return arr1;
        }

        int[] count = new int[1001];
        for (int n : arr1) count[n]++;

        int i = 0;
        for (int m : arr2) {
            while (count[m]-- > 0) {
                arr1[i++] = m;
            }
        }

        for (int j = 0; j < count.length; j++) {
            while (count[j]-- > 0) {
                arr1[i++] = j;
            }
        }
        return arr1;
    }
}
