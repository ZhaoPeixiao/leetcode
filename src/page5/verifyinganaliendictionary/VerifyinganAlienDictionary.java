package page5.verifyinganaliendictionary;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderArr = new int[26];
        for (int i = 0; i < 26; i ++){
            orderArr[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i ++){
            if (compare(words[i], words[i + 1], orderArr) > 0) {
                return false;
            }
        }
        return true;
    }


    public int compare(String a, String b, int[] order){

        int i = 0;
        while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)){
            i ++;
        }

        if (i == a.length() && i == b.length()) {
            return 0;
        }
        if (i == a.length()){
            return -1;
        }
        if (i == b.length()){
            return 1;
        }
        char charA = a.charAt(i);
        char charB = b.charAt(i);
        return order[charA -'a'] - order[charB - 'a'];
    }
}
