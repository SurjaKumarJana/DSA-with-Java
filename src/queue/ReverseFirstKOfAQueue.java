package queue;

import java.util.Queue;
import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
 */
public class ReverseFirstKOfAQueue {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();

        //important line..
        if(k>n) return q;

        for(int i = 0; i<k; i++) {
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i = 0; i<n-k; i++) {
            q.add(q.remove());
        }

        return q;
    }

}
