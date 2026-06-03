package stack;


import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1

 */
public class InsertAnElementAtButtomOfStackRecursively {

    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> st2 =  new Stack<>();
        return insert(st,st2,x);
    }

    public Stack<Integer> insert(Stack<Integer> st, Stack<Integer> st2, int x) {

        //base condition;
        if(st.isEmpty()){
            st.push(x);
            return st;
        }

        //pop the current element
        st2.push(st.pop());

        //recursive calling
        insert(st,st2,x);

        //adding element again
        st.push(st2.pop());

        return st;
    }
}
