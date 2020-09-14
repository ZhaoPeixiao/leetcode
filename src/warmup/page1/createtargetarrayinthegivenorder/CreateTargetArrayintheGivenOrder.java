package warmup.page1.createtargetarrayinthegivenorder;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        for (int i = 1; i < index.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (index[j] >= index[i]) {
                    index[j]++;
                }
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[index[i]] = nums[i];
        }
        return result;
    }
}
