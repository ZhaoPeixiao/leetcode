package warmup.page8.perfectnumber;

/**
 * @author Peixiao Zhao
 * @date 2020/9/7
 */
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int n = (int)Math.sqrt(num);
        int sum = 1;
        for (int i = 2; i <= n; i ++){
            sum += (num % i == 0)? i+(num/i) : 0;
        }
        return sum == num;
    }
}
