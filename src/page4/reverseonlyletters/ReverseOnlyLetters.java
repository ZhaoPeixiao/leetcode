package page4.reverseonlyletters;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        char[] res = new char[chars.length];
        for (int i = 0; i < chars.length; i ++){
            if (!Character.isAlphabetic(chars[i])) {
                res[i] = chars[i];
            }
            else{
                res[i] = 'a';
                stringBuilder.append(chars[i]);
            }
        }

        char[] tmp = stringBuilder.toString().toCharArray();
        int index = 0;
        for (int i = tmp.length - 1; i >= 0; i --){
            while (res[index] != 'a') {
                index ++;
            }
            res[index] = tmp[i];
            index ++;
        }
        StringBuilder result = new StringBuilder();
        for (char c : res){
            result.append(c);
        }
        return result.toString();
    }
}
