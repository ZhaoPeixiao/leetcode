package page8.excelsheetcolumntitle;

/**
 * @author Peixiao Zhao
 * @date 2020/9/10
 */
class Solution {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 26){
            int i = n % 26;
            if (i == 0){
                stringBuilder.append((char)('Z'));
                n /= 26;
                -- n;
            }
            else{
                stringBuilder.append((char)(i+'A' - 1));
                n/= 26;
            }
        }
        stringBuilder.append((char)(n+'A' - 1));
        return stringBuilder.reverse().toString();
    }
}
