package array.maximumproductsubarray;

class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max =nums[0];
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