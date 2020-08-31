package page6.findpivotindex;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int ls = 0, rs = 0;
        for (int i : nums){
            rs += i;
        }
        for (int i = 0; i < nums.length; i ++){
            rs -= nums[i];
            if (ls == rs) {
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
}
