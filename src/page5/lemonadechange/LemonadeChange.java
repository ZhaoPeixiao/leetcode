package page5.lemonadechange;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills){
            if (bill == 5) {
                five ++;
            }
            if (bill == 10) {
                ten ++;
                five --;
            }
            else{
                if (ten > 0){
                    ten --;
                    five --;
                }
                else{
                    five -= 3;
                }
            }
            if (five < 0){
                return false;
            }
        }
        return true;
    }
}
