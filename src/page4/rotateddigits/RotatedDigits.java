package page4.rotateddigits;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    private boolean check(int a){

        String str = Integer.toString(a);
        char[] arr =  str.toCharArray();
        int f1 = 0;
        for(char c : arr){
            if(c == '2' ||c == '5' || c == '6' || c == '9'){
                f1 = 1;
            }
            if(c == '3' ||c == '4' || c == '7'){
                f1 = 0;
                break;
            }
        }
        return f1 != 0;

    }
    public int rotatedDigits(int N) {
        int count  = 0;
        for(int i = 1;i<=N;i++){
            boolean b = check(i);
            if(b)
                count++;
        }
        return count;
    }
}
