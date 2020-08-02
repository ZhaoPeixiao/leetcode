package page2.removealladjacentduplicatesinstring;

import java.util.Stack;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack();

        for (char ch : S.toCharArray()) {
            if (stack.isEmpty() || ch != stack.peek()) {
                stack.push(ch);
            } else {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
