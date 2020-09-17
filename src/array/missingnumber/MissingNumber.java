package array.missingnumber;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, sum = 0;
        for(int num : nums) {
            sum += num;
        }
        int ans = (n*(n+1))/2 - sum;
        return ans;
    }
}
