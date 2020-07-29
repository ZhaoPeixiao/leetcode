package page1.selfdividingnumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i ++){
            if (isSelfDivided(i)){
                res.add(i);
            }
        }
        return res;
    }

    public boolean isSelfDivided(int num){
        String string = Integer.toString(num);
        for (int i = 0; i < string.length(); i ++){
            int n = Integer.parseInt(Character.toString(string.charAt(i)));
            if (n == 0) {
                return false;
            }
            if (num % n != 0) {
                return false;
            }
        }
        return true;
    }
}
