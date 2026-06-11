package stack;

import java.util.Stack;

/*
problem url: https://leetcode.com/problems/min-stack/
 */
class MinStack {
    //approach 1: using a stack to keep tracking the minimum values
    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
    }

    public void push(int value) {
        if(min.isEmpty() || value<min.peek()) min.push(value);
        else min.push(min.peek());
        stack.push(value);
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
