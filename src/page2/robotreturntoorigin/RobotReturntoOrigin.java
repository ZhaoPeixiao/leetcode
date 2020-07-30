package page2.robotreturntoorigin;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        char[] chs = moves.toCharArray();
        for(char c : chs){
            if (c == 'U') {
                y ++;
            }else if (c == 'D'){
                y --;
            }else if (c == 'L'){
                x ++;
            }else if (c == 'R'){
                x --;
            }
        }
        return x == 0 && y == 0;
    }
}
