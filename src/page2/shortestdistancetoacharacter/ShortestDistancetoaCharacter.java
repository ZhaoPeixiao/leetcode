package page2.shortestdistancetoacharacter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        List<Integer> cIndex = new ArrayList<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i ++){
            if (chars[i] == C) {
                cIndex.add(i);
            }
        }

        for (int i = 0; i < chars.length; i ++){
            if (chars[i] != C){
                res[i] = distance(i, cIndex);
            }
            else{
                res[i] = 0;
            }
        }
        return res;
    }

    public int distance(int index, List<Integer> cIndex){
        int min = Integer.MAX_VALUE;
        for (int n : cIndex){
            min = Math.min(min, Math.abs(index - n));
        }
        return min;
    }
}
