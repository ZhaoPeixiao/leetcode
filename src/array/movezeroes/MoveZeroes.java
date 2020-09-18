package array.movezeroes;

/**
 * @author Peixiao Zhao
 * @date 2020/9/18 17:21
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int t = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] != 0){
                nums[t++] = nums[i];
            }
        }
        for (int i = t; i < nums.length; i ++){
            nums[i] = 0;
        }
    }
}
