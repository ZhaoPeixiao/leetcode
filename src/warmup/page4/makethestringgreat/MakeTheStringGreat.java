package warmup.page4.makethestringgreat;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String makeGood(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        int i = 0;
        while (i < s.length()){
            char current = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(current);
                i ++;
                continue;
            }
            char previous = stack.pop();
            if (Character.toLowerCase(previous) == Character.toLowerCase(current)) {
                boolean firstChar = Character.isUpperCase(previous)? true : false;
                boolean secondChar = Character.isUpperCase(current)? true : false;
                if (firstChar != secondChar) {
                    i ++;
                    continue;
                }
            }
            stack.push(previous);
            stack.push(current);
            i ++;
        }

        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}
