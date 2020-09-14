package array.threesum;

import java.util.*;

/**
 * @author Peixiao Zhao
 * @date 2020/9/14 16:33
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int start = 0; start < nums.length; start ++){
            if (start != 0 && nums[start - 1] == nums[start]){
                continue;
            }
            int mid = start + 1, end = nums.length - 1;
            while (mid < end){
                int sum = nums[start] + nums[mid] + nums[end];
                if (sum == 0){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[start]);
                    tmp.add(nums[mid]);
                    tmp.add(nums[end]);
                    set.add(tmp);
                    mid ++;
                    end --;
                    while (mid < end && nums[mid] == nums[mid - 1]){
                        mid ++;
                    }
                    while (end > mid && nums[end] == nums[end + 1]){
                        end --;
                    }
                }
                else if (sum < 0){
                    mid ++;
                }
                else{
                    end --;
                }
            }
        }

        return new ArrayList<List<Integer>>(set);
    }
}
