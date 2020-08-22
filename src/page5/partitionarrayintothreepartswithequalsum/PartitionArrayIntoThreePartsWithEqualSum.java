package page5.partitionarrayintothreepartswithequalsum;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int target = 0;
        for (int i : A){
            target += i;
        }
        if (target % 3 != 0) {
            return false;
        }
        else{
            target = target / 3;
            int satisfied = 0;
            int sum = 0;
            for (int i : A){
                sum += i;
                if (sum == target){
                    satisfied ++;
                    sum = 0;
                }
            }
            return target == 0 && satisfied >= 3 ? true : satisfied == 3;
        }
    }
}
