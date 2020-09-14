package warmup.page4.comparestringsbyfrequencyofthesmallestcharacter;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] fQueries = new int[queries.length];
        int[] fWords = new int[words.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            char[] chars = query.toCharArray();
            fQueries[i] = count(chars);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] chars = word.toCharArray();
            fWords[i] = count(chars);
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < fQueries.length; i++) {
            int count = 0;
            for (int j = 0; j < fWords.length; j++) {
                if (fQueries[i] < fWords[j]) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;

    }


    private int count(char[] chars){
        int res = 1;
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i ++){
            if (chars[i] == chars[i + 1]){
                res ++;
            }
            else {
                break;
            }
        }
        return res;
    }
}
