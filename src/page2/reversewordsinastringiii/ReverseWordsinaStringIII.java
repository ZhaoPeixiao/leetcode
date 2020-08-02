package page2.reversewordsinastringiii;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i ++){
            stringBuilder.append(getReverse(strings[i]));
            if (i != strings.length - 1){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public String getReverse(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >=0; i --){
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
