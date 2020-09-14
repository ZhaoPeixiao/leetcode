package warmup.page2.findcommoncharacters;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<String> commonChars(String[] A) {
        int[] arr = new int[26];
        int[] temp = new int[26];

        for (char val : A[0].toCharArray()) {
            arr[val - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
            for (char val : A[i].toCharArray()) {
                temp[val - 'a']++;
            }

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Math.min(arr[j], temp[j]);
                temp[j] = 0;
            }

        }

        List<String> ll = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                while (arr[i]-- > 0)
                    ll.add((char) (i + 'a') + "");
            }
        }

        return ll;
    }
}
