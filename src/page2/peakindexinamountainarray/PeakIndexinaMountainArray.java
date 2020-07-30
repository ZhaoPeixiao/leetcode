package page2.peakindexinamountainarray;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int l = A.length;
        int mid = (l - 1) / 2;
        while ((mid - 1) >= 0 && (mid + 1) < l) {
            if ((A[mid] > A[mid + 1]) && (A[mid] > A[mid - 1])){
                break;
            }
            else if (A[mid] > A[mid - 1]){
                mid += 1;
            }
            else if (A[mid] > A[mid + 1]){
                mid -= 1;
            }
        }
        return mid;
    }
}
