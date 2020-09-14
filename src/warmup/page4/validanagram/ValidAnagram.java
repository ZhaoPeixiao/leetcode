package warmup.page4.validanagram;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = false;
        if (s.length() == t.length()) {
            isAnagram = true;
            int count[] = new int[256];
            for (char c : s.toCharArray()) {
                int index = (int) c;
                count[index]++;
            }
            for (char c : t.toCharArray()) {
                int index = (int) c;
                count[index]--;
            }
            for (int i = 0; i < 256; i++) {
                if (count[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }
        return isAnagram;
    }
}
