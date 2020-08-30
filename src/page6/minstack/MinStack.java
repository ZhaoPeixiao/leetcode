package page6.minstack;

/**
 * @Author: Peixiao Zhao
 */
class MinStack {
    private static class StackItem {
        int val;
        int minVal;
        StackItem prev;
    }

    private StackItem top;

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        StackItem newItem = new StackItem();
        newItem.prev = top;
        newItem.val = x;
        newItem.minVal = top == null ? x : Math.min(x, top.minVal);
        top = newItem;

    }

    public void pop() {
        if (top != null){
            top = top.prev;
        }
    }

    public int top() {
        if (top == null){
            throw new RuntimeException("Stack is empty");
        }
        return top.val;
    }

    public int getMin() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }

        return top.minVal;
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
