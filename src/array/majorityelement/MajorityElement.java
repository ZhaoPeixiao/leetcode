package array.majorityelement;

/**
 * @author Peixiao Zhao
 * @date 2020/9/16 20:35
 */
class Solution {
    public int majorityElement(int[] nums) {
        int m = nums[0];
        int c = 1;
        for (int n : nums){
            if (m == n){
                c ++;
            }
            else if (c > 1){
                c --;
            }
            else {
                m = n;
            }
        }
        return m;
    }
}
