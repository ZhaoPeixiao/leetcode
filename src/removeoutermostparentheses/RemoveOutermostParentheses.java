package removeoutermostparentheses;

import java.util.Stack;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack();
        int l = S.length();
        String res = "";
        int start = 0;
        for(int i = 0; i < l; i++){
            if(S.charAt(i) == '(') {
                stack.push(S.charAt(i));
            }
            else if(S.charAt(i) == ')') {
                stack.pop();

            }
            if(stack.isEmpty()) {
                res = res + S.substring(start+1, i);
                start = i+1;
            }
        }
        return res;
    }
}
