package page6.numberofequivalentdominopairs;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] res = new int[10][10];
        int count = 0;
        for (int i = 0; i <dominoes.length; i ++){
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            if (res[a][b] > 0){
                res[a][b] ++;
            }
            else if (res[b][a] > 0){
                res[b][a] ++;
            }
            else{
                res[a][b]++;
            }
        }

        for (int i = 0; i < res.length; i ++){
            for (int j = 0; j <res[0].length; j ++){
                count += (res[i][j]*(res[i][j]-1))/2;
            }
        }

        return count;
    }
}
