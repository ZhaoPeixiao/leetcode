package warmup.page6.addbinary;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String addBinary(String a, String b) {
        int la = a.length() - 1;
        int lb = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (la >= 0 || lb >= 0) {
            int aBit = la >= 0 ? a.charAt(la--) - '0' : 0;
            int bBit = lb >= 0 ? b.charAt(lb--) - '0' : 0;
            int sum = aBit + bBit + carry;
            carry = sum > 1 ? 1 : 0;
            if (sum <= 1)
                sb.insert(0, sum);
            else if (sum == 2)
                sb.insert(0, 0);
            else if (sum == 3)
                sb.insert(0, 1);
        }
        if (carry == 1)
            sb.insert(0, 1);
        return sb.toString();
    }
}
