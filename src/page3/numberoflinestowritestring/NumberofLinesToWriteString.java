package page3.numberoflinestowritestring;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int line = 1, units = 0;
        int[] res = new int[2];
        char[] chars = S.toCharArray();
        for (char c : chars){
            // 没满一行
            if (units + widths[c - 'a'] > 100) {
                line++;
                units = widths[c - 'a'];
            }
            else{
                units += widths[c - 'a'];
            }
        }
        return new int[]{line, units};
    }
}


public class NumberofLinesToWriteString{
    public static void main(String[] args) {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        int[] res = new Solution().numberOfLines(widths, S);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
