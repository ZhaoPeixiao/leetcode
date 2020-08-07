package page3.baseballgame;

import java.util.Stack;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        int sum = 0;
        for (String s: ops) {
            if (s.equals("C")) {
                sum -= stack.pop();
            } else if (s.equals("D")) {
                int d = stack.peek() * 2;
                stack.push(d);
                sum += d;
            } else if (s.equals("+")) {
                int tmp = stack.pop();
                int k = tmp + stack.peek();
                stack.push(tmp);
                stack.push(k);
                sum += k;
            } else {
                stack.push(Integer.valueOf(s));
                sum += stack.peek();
            }
        }
        return sum;
    }
}
