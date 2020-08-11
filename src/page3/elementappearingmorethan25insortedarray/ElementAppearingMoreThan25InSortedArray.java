package page3.elementappearingmorethan25insortedarray;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findSpecialInteger(int[] arr) {
        int res = arr[0];
        int step = arr.length / 4;
        for (int i = 0; i < arr.length - step; i++) {
            if (arr[i] == arr[i + step]) {
                res = arr[i];
                break;
            }
        }
        return res;
    }
}


