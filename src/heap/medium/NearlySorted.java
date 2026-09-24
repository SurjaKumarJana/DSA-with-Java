package heap.medium;

/*
problem url: https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1
 */


import java.util.PriorityQueue;

public class NearlySorted {

    /*solution using min heap , TC = O(nlogn)
        -------------------------------------------        */

    public void nearlySorted(int[] arr, int k) {
        int idx = 0;
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
        for(int x : arr){
            pq.add(x);
            if(pq.size()>k) {
                arr[idx] = pq.remove();
                idx++;
            }
        }
        for(;idx<n;idx++){
            arr[idx] = pq.remove();
        }
    }
}
