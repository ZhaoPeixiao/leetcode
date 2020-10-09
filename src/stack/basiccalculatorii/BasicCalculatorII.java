package stack.basiccalculatorii;

import java.util.Collections;
import java.util.Stack;

/**
 * @author Peixiao Zhao
 * @date 2020/10/9 10:45
 */
class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                int val = c - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))){
                    val = val * 10 + s.charAt(++i) - '0';
                }
                if (!stack.isEmpty() && (stack.peek() == 2 || stack.peek() == 3)){
                    int sign = stack.pop();
                    int op = stack.pop();
                    int res = 0;
                    if (sign == 2){
                        res = op * val;
                    }else {
                        res = op / val;
                    }
                    stack.push(res);
                }else {
                    stack.push(val);
                }
            }else if (c == ' '){
                continue;
            }else{
                switch (c){
                    case '+':
                        stack.push(0);
                        break;
                    case '-':
                        stack.push(1);
                        break;
                    case '*':
                        stack.push(2);
                        break;
                    case '/':
                        stack.push(3);
                        break;
                }
            }
        }

        if (stack.isEmpty()){
            return 0;
        }

        Collections.reverse(stack);
        int res = stack.pop();
        while (!stack.isEmpty()){
            int sign = stack.pop();
            int op = stack.pop();
            if (sign == 0){
                res += op;
            }else {
                res -= op;
            }
        }

        return res;
    }
}
