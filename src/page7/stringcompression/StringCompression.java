package page7.stringcompression;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while (index < chars.length) {
            char currentChar = chars[index];
            int count = 0;
            while (index < chars.length && chars[index] == currentChar) {
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if (count == 1) continue;
            while (count >= 0) {
                int temp;
                if (count >= 10) temp = count / 10;
                else temp = count;
                chars[indexAns++] = (char) (temp % 10 + '0');
                if (count == 0) break;
                count -= temp * 10;
            }
        }
        return indexAns;
    }
}
