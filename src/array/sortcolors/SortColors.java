package array.sortcolors;

/**
 * @author Peixiao Zhao
 * @date 2020/9/20 14:28
 */
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int red = 0, white = 0, blue = 0;
        for (int i : nums){
            if (i == 0){
                red ++;
            }
            else if (i == 1){
                white ++;
            }
            else{
                blue ++;
            }
        }

        int i = 0;
        while (red -- > 0){
            nums[i++] = 0;
        }
        while (white-- > 0) {
            nums[i++] = 1;
        }
        while (blue-- > 0) {
            nums[i++] = 2;
        }
    }
}
