package page6.onebitandtwobitcharacters;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        int idx = 0;
        boolean found = false;
        int digit = -1;
        while (idx < len){
            if (bits[idx] == 1){
                idx += 2;
                digit = 2;
            }
            else{
                digit = 1;
                idx ++;
            }
        }
        if (digit == 1){
            found = true;
        }
        return found;
    }
}
