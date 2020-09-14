package warmup.page1.maximum69number;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == '9') {
                stringBuilder.append(str.charAt(i));
            }
            else{
                stringBuilder.append('9');
                stringBuilder.append(str.substring(i + 1, str.length()));
                break;
            }
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
