package warmup.page7.reversebits;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i = 0, j = 31, num = 0;
        while (i <=j){
            int bi= (n & (1<<i))==0?0:1;
            int bj=( n & (1<<j))==0?0:1;

            num |= bi << j;
            num |= bj << i;
            i++;j--;
        }
        return num;
    }
}
