package page8.shortestunsortedcontinuoussubarray;

/**
 * @author Peixiao Zhao
 * @date 2020/9/10
 */
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length < 2){
            return 0;
        }
        int left = nums.length, right = nums.length, max = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] >= nums[max]){
                max = i;
            }
            else{
                right = i;
                if (left > max){
                    left = max;
                }
                while (left >= 0 && nums[right] < nums[left]){
                    left --;
                }
            }
        }
        return right - left;
    }
}
