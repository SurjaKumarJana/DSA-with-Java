package heap.medium;

/*
problem url: https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    /*solution using max heap , TC = O(nlogk)
-------------------------------------------    */
    public int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// creating a max heap
        for(int x: arr){
            pq.add(x);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();

    }
}
