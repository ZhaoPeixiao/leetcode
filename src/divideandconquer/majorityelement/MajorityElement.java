package divideandconquer.majorityelement;

/**
 * @author Peixiao Zhao
 * @date 2020/10/2 20:56
 */
class Solution {
    public int majorityElement(int[] nums) {
        int m = nums[0];
        int c = 1;

        for (int i = 1; i < nums.length; i ++){
            if (m == nums[i]){
                c ++;
            }else if (c > 1){
                c --;
            }else{
                m = nums[i];
            }
        }

        return m;
    }
}
