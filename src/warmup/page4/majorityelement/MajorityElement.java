package warmup.page4.majorityelement;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
//class Solution {
//    public int majorityElement(int[] nums) {
//        int max = 0, res = nums[0];
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums){
//            if (map.containsKey(num)){
//                map.put(num, map.get(num) + 1);
//                if (map.get(num) >= max) {
//                    max = map.get(num);
//                    res = num;
//                }
//            }
//            else{
//                map.put(num, 1);
//            }
//        }
//        return res;
//    }
//}

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length/2; i ++){
            if (nums[i] == nums[i + nums.length/2]){
                return nums[i];
            }
        }
        return -1;
    }
}
