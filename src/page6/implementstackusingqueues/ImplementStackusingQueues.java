package page6.implementstackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Peixiao Zhao
 */
class MyStack {
    Queue<Integer> queue;
    int top;

    /** Initialize your data structure here. */
    public MyStack() {
        this.queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int topElem = top;
        queue.remove(topElem);
        if (!queue.isEmpty()){
            top = getTop();
        }
        return topElem;
    }

    private int getTop(){
        Integer[] arr = new Integer[queue.size()];
        arr = queue.toArray(arr);
        return arr[queue.size() - 1];
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
