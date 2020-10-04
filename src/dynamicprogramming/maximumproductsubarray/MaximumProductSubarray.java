package dynamicprogramming.maximumproductsubarray;

/**
 * @author Peixiao Zhao
 * @date 2020/10/4 15:32
 */
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int positive = nums[0];
        int negative = nums[0];

        for (int i = 1; i < nums.length; i ++){
            positive *= nums[i];
            negative *= nums[i];

            if (positive < negative){
                int t = positive;
                positive = negative;
                negative = t;
            }

            positive = Math.max(positive, nums[i]);
            negative = Math.min(negative, nums[i]);

            max = Math.max(max, positive);
        }

        return max;
    }
}
