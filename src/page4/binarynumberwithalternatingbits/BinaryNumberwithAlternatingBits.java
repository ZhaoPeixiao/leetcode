package page4.binarynumberwithalternatingbits;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        for (int i = 1; i < binary.length(); i++) {
            if (binary.charAt(i) == binary.charAt(i - 1))
                return false;
        }
        return true;
    }
}
