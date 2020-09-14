package warmup.page6.convertanumbertohexadecimal;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String toHex(int num) {
        String hex = "0123456789abcdef";
        StringBuilder stringBuilder = new StringBuilder();
        do {
            stringBuilder.append(hex.charAt(num&0xf));
            num >>>= 4;
        }while (num != 0);

        return stringBuilder.reverse().toString();
    }
}
