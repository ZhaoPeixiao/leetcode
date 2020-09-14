package warmup.page1.decryptstringfromalphabettointegermapping;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < s.length()){
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int n = Integer.parseInt(s.substring(i, i + 2));
                char c = (char) (96 + n);
                stringBuilder.append(c);
                i += 3;
            }
            else{
                int n = Integer.parseInt(s.substring(i, i + 1));
                char c = (char) (96 + n);
                stringBuilder.append(c);
                i ++;
            }
        }
        return stringBuilder.toString();
    }
}
