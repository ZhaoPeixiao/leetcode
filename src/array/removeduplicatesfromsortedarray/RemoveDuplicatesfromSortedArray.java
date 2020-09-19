package array.removeduplicatesfromsortedarray;

/**
 * @author Peixiao Zhao
 * @date 2020/9/19 16:22
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null){
            return -1;
        }
        if (nums.length < 2){
            return nums.length;
        }
        int len = 0;
        for (int i = 1; i < nums.length; i ++){
            if (nums[len] != nums[i]){
                nums[++len] = nums[i];
            }
        }
        return len + 1;
    }
}
