package divideandconquer.differentwaystoaddparentheses;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/2 20:04
 */
class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new LinkedList<>();
        int len = input.length();

        for (int i = 0; i < len; i ++){
            if (input.charAt(i) == '-' || input.charAt(i) == '+' || input.charAt(i) == '*'){
                String part1 = input.substring(0, i);
                String part2 = input.substring(i + 1);

                List<Integer> part1Res = diffWaysToCompute(part1);
                List<Integer> part2Res = diffWaysToCompute(part2);

                for (Integer p1 : part1Res){
                    for (Integer p2 : part2Res){
                        int c = 0;
                        switch (input.charAt(i)){
                            case '+':
                                c = p1 + p2;
                                break;
                            case '-':
                                c = p1 - p2;
                                break;
                            case '*':
                                c = p1 * p2;
                        }
                        res.add(c);
                    }
                }
            }
        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(input));
        }
        return res;
    }
}
