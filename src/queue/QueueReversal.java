package queue;

import java.util.Queue;
import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/queue-reversal/1
 */
public class QueueReversal {
    public void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()) st.push(q.remove());
        while(!st.isEmpty()) q.add(st.pop());

    }
}
