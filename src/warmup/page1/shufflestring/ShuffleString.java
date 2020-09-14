package warmup.page1.shufflestring;


class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = new char[s.length()];
        for (int i = 0; i < indices.length; i ++){
            c[indices[i]] = s.charAt(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < c.length; i ++){
            stringBuilder.append(c[i]);
        }

        return stringBuilder.toString();
    }
}
