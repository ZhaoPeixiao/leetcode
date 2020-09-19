package array.rotatearray;

/**
 * @author Peixiao Zhao
 * @date 2020/9/19 16:28
 */
class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;

        k = k % len;
        if (len == 1 || k == 0){
            return;
        }
        reverse(nums, 0, len - k - 1);
        reverse(nums, len - k, len - 1);
        reverse(nums, 0, len - 1);
    }

    public void reverse(int[] nums, int start, int end){
        while (start < end){
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start ++;
            end --;
        }
    }
}
