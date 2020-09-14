package warmup.page6.rangeadditionii;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int c = n, r = m;
        for (int[] op : ops){
            c = Math.min(c, op[1]);
            r = Math.min(r, op[0]);
        }
        return r * c;
    }
}
