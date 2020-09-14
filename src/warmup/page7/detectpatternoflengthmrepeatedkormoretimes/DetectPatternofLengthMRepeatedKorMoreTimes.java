package warmup.page7.detectpatternoflengthmrepeatedkormoretimes;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int toM = 0, tok = 0;
        for (int i = 0; i < arr.length - m; i ++){
            if (arr[i] == arr[i + m]){
                toM ++;
            }
            else{
                toM = 0;
                tok = 0;
            }
            if (toM == m) {
                tok ++;
                toM = 0;
            }
            if (tok == k - 1){
                return true;
            }
        }
        return tok >= k;
    }
}
