package warmup.page3.numbercomplement;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findComplement(int num) {
        boolean startIndex = false;
        for (int i = 31; i >= 0; i--) {
            if ((num & (1 << i)) == 0 && !startIndex) {
                continue;
            } else {
                num = num ^ (1 << i);
                startIndex = true;
            }

        }

        return num;
    }
}
