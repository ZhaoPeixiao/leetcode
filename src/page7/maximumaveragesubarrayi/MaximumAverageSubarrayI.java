package page7.maximumaveragesubarrayi;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j = k - 1;
        double max = 0, tmp = 0;
        for (int m = 0; m < k; m ++){
            max = max + nums[m];
        }
        tmp = max;
        while (j < nums.length - 1){
            tmp = tmp - nums[j-k+1] + nums[++j];
            if (tmp > max) {
                max = tmp;
            }
        }
        return max/k;
    }
}
