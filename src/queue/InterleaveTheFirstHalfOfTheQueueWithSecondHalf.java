package queue;

import java.util.LinkedList;
import java.util.Queue;

/*
problem url: https://www.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/1
 */
public class InterleaveTheFirstHalfOfTheQueueWithSecondHalf {
    public void rearrangeQueue(Queue<Integer> q) {
        //approach 1: using queue
        Queue<Integer> q2 = new LinkedList<>();
        int n = q.size();
        for(int i = 0; i<n/2; i++){
            q2.add(q.remove());
        }

        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }


    }
}
