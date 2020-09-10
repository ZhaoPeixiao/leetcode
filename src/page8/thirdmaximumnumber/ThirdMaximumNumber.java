package page8.thirdmaximumnumber;

/**
 * @author Peixiao Zhao
 * @date 2020/9/10
 */
class Solution {
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int number = 0;
        boolean minAppearOnlyOnce = true;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if (nums[i] > second && nums[i] != first){
                third = second;
                second = nums[i];
            }else if (nums[i] > third && nums[i] != second && nums[i] != first){
                third = nums[i];
            } else if (nums[i] == Integer.MIN_VALUE && minAppearOnlyOnce){
                minAppearOnlyOnce = false;
            }
            else{
                continue;
            }
            number++;
        }
        return number > 2? third:first;
    }
}
