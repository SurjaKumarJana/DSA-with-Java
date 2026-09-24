package heap.medium;

import java.util.PriorityQueue;

/*
problem url: https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
 */
public class MinCostToConnectRopes {

    /*solution using min heap , TC = O(nlogn)
        -------------------------------------------        */

    public int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : arr){
            pq.add(x);
        }
        int cost = 0;
        while(pq.size()>1){
            int sum = pq.remove() + pq.remove();
            cost += sum;
            pq.add(sum);
        }
        return cost;
    }
}
