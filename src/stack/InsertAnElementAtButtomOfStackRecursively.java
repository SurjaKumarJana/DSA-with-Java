package stack;


import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1

 */
public class InsertAnElementAtButtomOfStackRecursively {

    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {

        //base case;
        if(st.isEmpty()){
            st.push(x);
            return st;
        }

        //pop the current element
        int curr = st.pop();

        //recursive calling
        insertAtBottom(st,x);

        //adding element again
        st.push(curr);

        return st;

    }
}
