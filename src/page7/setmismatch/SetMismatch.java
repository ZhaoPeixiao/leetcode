package page7.setmismatch;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int res[] = new int[2];

        for (int i = 0; i < n; i ++){
            nums[i] --;
        }
        for (int i = 0; i < n; i ++){
            int index = nums[i];
            nums[index % n] = nums[index % n] + n;
        }

        for (int i = 0; i < n; i ++){
            int count = nums[i] / n;
            if (count == 2){
                res[0] = i + 1;
            } else if (count == 0) {
                res[1] = i + 1;
            }
            if (res[0] != 0 && res[1] != 0) {
                break;
            }
        }
        return res;
    }
}
