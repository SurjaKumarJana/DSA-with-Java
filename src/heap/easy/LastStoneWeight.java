package heap.easy;

/*
problem url: https://leetcode.com/problems/last-stone-weight/
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    /*solution using max heap , TC = O(nlogn)
    -------------------------------------------*/
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//max heap

        //insertion of elements in heap
        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();
            if(x!=y) pq.add( (y>x) ? y-x : x-y);
            else pq.add(0);

        }
        return pq.remove();
    }
}
