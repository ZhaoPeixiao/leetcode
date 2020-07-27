package tolowercase;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String toLowerCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i ++){
            if (Character.isUpperCase(str.charAt(i))){
                stringBuilder.append(Character.toLowerCase(str.charAt(i)));
            }
            else{
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
