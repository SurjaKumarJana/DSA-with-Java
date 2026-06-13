package queue;

import java.util.Stack;

/*
problem url: https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class ImplementQueueUsingStacks {
    //approach 1: pop effecient approach
    Stack<Integer> st;
    Stack<Integer> st2;

    public ImplementQueueUsingStacks() {
        st = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {

        while(st.size()!=1) {
            st2.push(st.pop());
        }
        int value = st.pop();

        while(!st2.isEmpty()) {
            st.push(st2.pop());
        }
        return value;
    }

    public int peek() {

        while(st.size()!=1) {
            st2.push(st.pop());
        }
        int value = st.peek();

        while(!st2.isEmpty()) {
            st.push(st2.pop());
        }
        return value;
    }

    public boolean empty() {
        return st.isEmpty();
    }
}
