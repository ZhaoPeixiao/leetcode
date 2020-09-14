package warmup.page5.findthetownjudge;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findJudge(int N, int[][] trust) {
        if (trust.length < N - 1){
            return -1;
        }
        int[] count = new int[N + 1];
        for (int[] t : trust){
            count[t[0]] --;
            count[t[1]] ++;
        }
        for (int i = 1; i <= N; i ++){
            if (count[i] == N - 1){
                return i;
            }
        }
        return -1;
    }
}
