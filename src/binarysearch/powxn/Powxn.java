package binarysearch.powxn;

/**
 * @author Peixiao Zhao
 * @date 2020/10/1 19:30
 */
class Solution {
    public double myPow(double x, int n) {
        if (n < 0){
            return 1 / pow(x, -n);
        }else {
            return pow(x, n);
        }
    }

    public double pow(double x, int n){

        if (n == 0){
            return 1;
        }

        double v = pow(x, n / 2);
        if (n % 2 == 0){
            return v * v;
        }
        else{
            return v * v * x;
        }
    }
}
