package warmup.page6.reversevowelsofastring;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String reverseVowels(String s) {
        char str[] = s.toCharArray();
        int len = s.length();
        int f = 0;
        int l = len - 1;
        while (f < l) {
            char c = str[f];
            char d = str[l];
            if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') && (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' || d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U')) {
                str[f] = d;
                str[l] = c;
                f++;
                l--;
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                l--;
            } else if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' || d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U') {
                f++;
            } else {
                f++;
                l--;
            }
        }
        String res = String.valueOf(str);
        return res;
    }
}
