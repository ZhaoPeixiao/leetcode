package warmup.page4.containsduplicate;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums){
//            if (set.contains(num)) {
//                return true;
//            }
//            else {
//                set.add(num);
//            }
//        }
//
//        return false;
//    }
//}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 1) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }

        return false;
    }
}