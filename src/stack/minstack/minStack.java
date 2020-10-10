package stack.minstack;

import java.util.Stack;

/**
 * @author Peixiao Zhao
 * @date 2020/10/10 18:14
 */
class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if (stack.isEmpty()){
            stack.push(x);
            min.push(x);
        }else {
            stack.push(x);
            min.push(Math.min(stack.peek(), min.peek()));
        }
    }

    public void pop() {
        if (!stack.isEmpty()){
            stack.pop();
            min.pop();
        }
    }

    public int top() {
        if (!stack.isEmpty()){
            return stack.peek();
        }
        throw new IllegalStateException();
    }

    public int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        }
        throw new IllegalStateException();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
