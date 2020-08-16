package page4.findthedifference;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        char[] tChars = t.toCharArray();
        char[] sChars = s.toCharArray();
        for (char c : tChars){
            count[c - 'a'] ++;
        }
        for (char c : sChars){
            count[c - 'a'] --;
        }
        for (int i = 0; i < count.length; i ++){
            if (count[i] != 0){
                return (char) (i + 'a');
            }
        }

        return 'a';
    }

//    class Solution {
//        public char findTheDifference(String s, String t) {
//            int sSum = 0;
//            int tSum = 0;
//
//            for (int i = 0; i < s.length(); i++) {
//                sSum += (int) s.charAt(i);
//            }
//
//            for (int i = 0; i < t.length(); i++) {
//                tSum += (int) t.charAt(i);
//            }
//
//            int asciiDifference = Math.abs(sSum - tSum);
//            return (char) asciiDifference;
//        }
//    }
}
