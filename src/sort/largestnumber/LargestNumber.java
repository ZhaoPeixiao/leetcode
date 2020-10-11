package sort.largestnumber;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Peixiao Zhao
 * @date 2020/10/11 15:24
 */
class Solution {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < strs.length; i ++){
            strs[i] = nums[i] +"";
        }

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if ("0".equals(strs[0])){
            return "0";
        }

        return String.join("", strs);
    }
}
