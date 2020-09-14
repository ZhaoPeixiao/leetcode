package warmup.page6.rotatestring;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean rotateString(String A, String B) {
        if (A.equals(B)) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(A);
        for (int i = 0; i <A.length(); i ++){
            stringBuilder.append(stringBuilder.charAt(0));
            stringBuilder.delete(0, 1);
            if (stringBuilder.toString().equals(B)){
                return true;
            }
        }
        return false;
    }
}
