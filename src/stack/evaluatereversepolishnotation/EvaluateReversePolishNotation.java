package stack.evaluatereversepolishnotation;

import java.util.Stack;

/**
 * @author Peixiao Zhao
 * @date 2020/10/9 10:51
 */
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens){
            if (s.equals("*")){
                int n2 = stack.pop();
                int n1 = stack.pop();

                stack.push(n1 * n2);
            }else if (s.equals("/")){
                int n2 = stack.pop();
                int n1 = stack.pop();

                stack.push(n1 / n2);
            }else if (s.equals("+")){
                int n2 = stack.pop();
                int n1 = stack.pop();

                stack.push(n1 + n2);
            }else if (s.equals("-")){
                int n2 = stack.pop();
                int n1 = stack.pop();

                stack.push(n1 - n2);
            }else{
                stack.push(Integer.valueOf(s));
            }
        }

        return stack.pop();
    }
}
