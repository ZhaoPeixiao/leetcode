package warmup.page1.replaceelementswithgreatestelementonrightside;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        int curr_max = max;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
            }
            arr[i] = curr_max;
            curr_max = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
