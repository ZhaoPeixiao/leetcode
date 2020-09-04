package page7.validparentheses;

import java.util.Stack;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || !isMatching(stack.peek(), c)) {
                    return false;
                }
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }

    public boolean isMatching(char leftParen, char rightParen){
        return (leftParen == '[' && rightParen == ']') ||
                (leftParen == '{' && rightParen == '}') ||
                (leftParen == '(' && rightParen == ')');
    }
}
