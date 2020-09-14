package warmup.page5.greatestcommondivisorofstrings;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String answer = "";
        for (int len = 1; len <= str1.length() && len <= str2.length(); len++) {
            if (str1.length() % len != 0 || str2.length() % len != 0) {
                continue;
            }
            String str = str1.substring(0, len);
            if (!str.repeat(str1.length() / len).equals(str1)) {
                continue;
            }
            if (!str.repeat(str2.length() / len).equals(str2)) {
                continue;
            }
            answer = str;
        }
        return answer;
    }
}
