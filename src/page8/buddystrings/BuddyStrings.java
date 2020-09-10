package page8.buddystrings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Peixiao Zhao
 * @date 2020/9/10
 */
class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() < 2 || B.length() < 2 || A.length() != B.length())
            return false;
        if(A.equals(B)){
            int[] counts = new int[26];

            for(char ch : A.toCharArray())
                counts[ch - 'a']++;
            for(int i : counts)
                if(i > 1) return true;
            return false;
        }
        int diff_count  = 0;
        int idx1 = -1;
        int idx2 = -1;
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) != B.charAt(i)){
                diff_count++;
                if(diff_count == 1) idx1 = i;
                if(diff_count == 2) idx2 = i;
                if(diff_count > 2) return false;
            }
        }
        if(diff_count == 2 && A.charAt(idx1) == B.charAt(idx2) &&
                B.charAt(idx1) == A.charAt(idx2)){
            return true;
        }
        return false;
    }
}
