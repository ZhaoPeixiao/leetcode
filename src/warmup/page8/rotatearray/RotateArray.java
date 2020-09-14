package warmup.page8.rotatearray;

/**
 * @author Peixiao Zhao
 * @date 2020/9/8
 */
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i < k; i ++){
            int tmp = nums[nums.length - 1];
            for (int j = nums.length-1; j > 0; j --){
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }
}
