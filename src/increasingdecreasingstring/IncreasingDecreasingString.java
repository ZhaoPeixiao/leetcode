package increasingdecreasingstring;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String sortString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] letterFrequency = new int[26];
        Arrays.fill(letterFrequency, 0);
        for (int i = 0; i <s.length(); i ++){
            letterFrequency[s.charAt(i) - 'a'] ++;
        }
        int letterCount = s.length();
        while (letterCount > 0){
            for (int i = 0; i < letterFrequency.length; i ++){
                if (letterFrequency[i] != 0){
                    stringBuilder.append((char)(i + 97));
                    letterFrequency[i] --;
                    letterCount --;
                }
            }

            for (int i = letterFrequency.length - 1; i >= 0; i --){
                if (letterFrequency[i] != 0){
                    stringBuilder.append((char)(i + 97));
                    letterFrequency[i] --;
                    letterCount --;
                }
            }
        }

        return stringBuilder.toString();
    }
}
