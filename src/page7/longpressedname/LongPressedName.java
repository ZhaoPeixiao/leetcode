package page7.longpressedname;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] n = name.toCharArray();
        char[] t = typed.toCharArray();
        int i = 0, j = 0;
        char last = ' ';
        while (i < n.length && j < t.length) {
            if (n[i] == t[j]){
                last = n[i];
                i ++;
                j ++;
            }
            else{
                if (t[j] == last) {
                    j ++;
                }
                else{
                    return false;
                }
            }
        }
        for (int a = j - 1; a < t.length - 1; a ++){
            if (t[a] != t[a+1]){
                return false;
            }
            j ++;
        }

        return (i == n.length && j == t.length);
    }
}
