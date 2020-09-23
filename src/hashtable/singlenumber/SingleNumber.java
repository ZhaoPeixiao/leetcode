package hashtable.singlenumber;

/**
 * @author Peixiao Zhao
 * @date 2020/9/23 16:18
 */
class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;
        for (int i : nums){
            n ^= i;
        }
        return n;
    }
}
