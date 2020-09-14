package warmup.page4.maximumscoreaftersplittingastring;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int maxScore(String s) {
        int max = 0;
        for (int i = 1; i < s.length(); i ++){
            String left = s.substring(0, i);
            String right = s.substring(i, s.length());
            int sum = zero(left) + one(right);
            max = Math.max(sum, max);
        }
        return max;
    }


    public int zero(String str){
        int count = 0;
        char[] chars = str.toCharArray();
        for (char c : chars){
            if (c == '0'){
                count ++;
            }
        }
        return count;
    }

    public int one(String str){
        int count = 0;
        char[] chars = str.toCharArray();
        for (char c : chars){
            if (c == '1'){
                count ++;
            }
        }
        return count;
    }
}
