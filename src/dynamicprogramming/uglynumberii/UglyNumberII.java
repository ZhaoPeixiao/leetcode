package dynamicprogramming.uglynumberii;

/**
 * @author Peixiao Zhao
 * @date 2020/10/5 19:40
 */
class Solution {
    public int nthUglyNumber(int n) {
        int[] nums = new int[n];

        nums[0] = 1;

        int i = 0, j = 0, k = 0, t = 1;
        while (t < n){
            int min = Math.min(Math.min(nums[i] * 2, nums[j] * 3), nums[k] * 5);
            nums[t ++] = min;
            if (nums[i] * 2 == min){
                i ++;
            }
            if (nums[j] * 3 == min){
                j ++;
            }
            if (nums[k] * 5 == min){
                k ++;
            }

        }
        return nums[n - 1];
    }
}
