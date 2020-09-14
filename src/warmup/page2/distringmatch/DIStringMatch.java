package warmup.page2.distringmatch;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] diStringMatch(String S) {
        int l = 0, r = S.length();
        int[] res = new int[S.length() + 1];
        char[] chars = S.toCharArray();

        for (int i = 0; i < chars.length; i ++){
            if (chars[i] == 'I'){
                res[i] = l ++;
                res[i + 1] = l;
            }
            else{
                res[i] = r --;
                res[i + 1] = r;
            }
        }
        return res;
    }
}
