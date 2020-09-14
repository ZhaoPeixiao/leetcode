package warmup.page2.groupsofspecialequivalentstrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> res = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : A){
            int[] odd = new int[26], even = new int[26];
            for (int i = 0; i < str.length(); i ++){
                if (i % 2 == 0){
                    even[str.charAt(i) - 'a'] ++;
                }
                else {
                    odd[str.charAt(i) - 'a'] ++;
                }
            }
            stringBuilder.append(Arrays.toString(even));
            stringBuilder.append(Arrays.toString(odd));
            res.add(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
        return res.size();
    }
}
