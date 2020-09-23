package hashtable.singlenumberii;

/**
 * @author Peixiao Zhao
 * @date 2020/9/23 16:19
 */
class Solution {
    public int singleNumber(int[] nums) {
        int rt = 0, bit = 1;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int v : nums) {
                if ((v & bit) != 0) {
                    count++;
                }
            }
            bit <<= 1;
            rt |= (count % 3) << i;
        }
        return rt;
    }
}
