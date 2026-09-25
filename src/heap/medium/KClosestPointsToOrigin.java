package heap.medium;

/*
problem url: https://leetcode.com/problems/k-closest-points-to-origin/
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    /*solution using max heap , TC = O(nlogk)
-------------------------------------------    */
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Point> pq = new PriorityQueue<>(Collections.reverseOrder());//max heap

        //inserting points into the heap
        for(int[] point : points){
            Point p = new Point(point[0], point[1]);
            pq.add(p);
            if(pq.size()>k) pq.remove();
        }

        //collecting the results
        int[][] ans = new int[k][2];
        int idx = 0;

        while(pq.size()>0){
            Point p = pq.remove();
            ans[idx][0] = p.x;
            ans[idx][1] = p.y;

            idx++;
        }

        return ans;

    }
}
