package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/1
 */
public class InterleaveTheFirstHalfOfTheQueueWithSecondHalf {
    public void rearrangeQueue(Queue<Integer> q) {
        //approach 1: using queue
        /*
        Queue<Integer> q2 = new LinkedList<>();
        int n = q.size();
        for(int i = 0; i<n/2; i++){
            q2.add(q.remove());
        }

        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
        */
        //approach 2: using single stack
        Stack<Integer> st = new Stack<>();
        int n = q.size();


        //q : 1 2 3 4 5 6 7 8
        //st:
        //add first n/2 elements to the stack
        for(int i = 0; i<n/2; i++){
            st.push(q.remove());
        }


        //q : 5 6 7 8
        //st: 4 3 2 1(bottom)
        //add all the elements of the stack to the queue
        while(!st.isEmpty()){
            q.add(st.pop());
        }


        //q : 5 6 7 8 4 3 2 1
        //st:
        //add first n/2 elements to the stack
        for(int i = 0; i<n/2; i++){
            st.push(q.remove());
        }

        //q: 4 3 2 1
        //st: 8 7 6 5(bottom)
        //now add one element from the stack and one from the queue to the queue one by one
        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }
        //q: 8 4 7 3 6 2 5 1
        //st:
        //now add the elements of the queue to the stack to get them in reverse order
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        //q:
        //st: 1 5 2 6 3 7 4 8(bottom)
        while(!st.isEmpty()){
            q.add(st.pop());
        }


    }
}
