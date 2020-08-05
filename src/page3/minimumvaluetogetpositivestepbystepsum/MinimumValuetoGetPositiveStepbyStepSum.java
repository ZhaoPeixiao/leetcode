package page3.minimumvaluetogetpositivestepbystepsum;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i : nums){
            sum += i;
            min = Math.min(min, sum);
        }
        System.out.println(min);
        return min > 0? 1 : -min + 1;
    }
}


