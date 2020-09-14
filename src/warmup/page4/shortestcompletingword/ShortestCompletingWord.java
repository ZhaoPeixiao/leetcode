package warmup.page4.shortestcompletingword;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String p = licensePlate.toLowerCase();

        int[] ch = new int[26];
        for (int i = 0; i < p.length(); ++i)
            if (Character.isAlphabetic(p.charAt(i))) ch[p.charAt(i) - 'a']++;

        String res = null;

        for (int i = 0; i < words.length; ++i) {
            if (same(words[i], ch)) {
                if (res == null) res = words[i];
                else {
                    if (words[i].length() < res.length())
                        res = words[i];
                }
            }
        }

        return res;
    }

    public boolean same(String s, int[] ch) {
        int[] ch2 = new int[26];
        for (int i = 0; i < s.length(); ++i)
            if (Character.isAlphabetic(s.charAt(i))) ch2[s.charAt(i) - 'a']++;

        for (int i = 0; i < ch.length; ++i)
            if (ch[i] > 0 && ch2[i] < ch[i]) return false;

        return true;
    }
}
