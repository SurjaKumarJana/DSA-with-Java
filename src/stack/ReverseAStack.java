package stack;

import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/reverse-a-stack/1
 */
public class ReverseAStack {

    public static void reverseStack(Stack<Integer> st) {

        //base case : if stack is empty then return
        if(st.isEmpty()) return;

        // pop the top
        Integer top = st.pop();

        // reverse the remaining stack using recursion
        reverseStack(st);

        //now push the top at the buttom using recursion
        pushAtButtom(st, top);

    }

    public static void pushAtButtom(Stack<Integer> st, Integer x) {

        //base case : if stack is empty, push x into the stack
        if(st.isEmpty()){
            st.push(x);
            return;
        }

        // pop the top
        Integer top = st.pop();

        // push x at buttom using recursion
        pushAtButtom(st,x);

        //now push the current top
        st.push(top);
    }
}
