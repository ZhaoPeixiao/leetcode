package warmup.page5.assigncookies;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int k = 0, res = 0;
        for (int i = 0; i < g.length; i ++){
            while (k < s.length && s[k] < g[i]){
                k ++;
            }
            if (k < s.length && s[k] >= g[i]){
                res ++;
                k ++;
            }
        }
        return res;
    }
}
