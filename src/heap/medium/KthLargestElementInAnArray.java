package heap.medium;

/*
problem url: https://leetcode.com/problems/kth-largest-element-in-an-array/
 */

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
        /*solution using min heap , TC = O(nlogk)
    -------------------------------------------    */

    public int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();// creating a min heap
        for(int x: arr){
            pq.add(x);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
}
