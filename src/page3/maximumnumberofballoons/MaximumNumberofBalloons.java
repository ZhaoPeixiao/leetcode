package page3.maximumnumberofballoons;

import java.util.Arrays;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[5];
        char[] chars = text.toCharArray();
        for (char c : chars){
            if (c == 'a'){
                count[0] +=1;
            } else if (c == 'b') {
                count[1] += 1;
            } else if (c == 'l'){
                count[2] += 1;
            } else if (c == 'o'){
                count[3] += 1;
            } else if (c == 'n'){
                count[4] += 1;
            }
        }
        for (int n : count){
            System.out.println(n);
        }
        count[2] = count[2] / 2;
        count[3] = count[3] / 2;
        Arrays.sort(count);
        return count[0];
    }
}

//public class MaximumNumberofBalloons{
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.maxNumberOfBalloons("nlaebolko"));
//    }
//}
