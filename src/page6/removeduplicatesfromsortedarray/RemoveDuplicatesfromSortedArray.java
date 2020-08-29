package page6.removeduplicatesfromsortedarray;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] != nums[index]){
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }
}
