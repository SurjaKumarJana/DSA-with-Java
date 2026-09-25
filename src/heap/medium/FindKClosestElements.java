package heap.medium;

/*
problem url: https://leetcode.com/problems/find-k-closest-elements/
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestElements {
    /*solution using max heap , TC = O(nlogk)
-------------------------------------------    */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Element> pq = new PriorityQueue<>(Collections.reverseOrder());//max heap
        for(int i : arr){
            Element e = new Element(i,x);
            pq.add(e);
            if(pq.size()>k) pq.remove();
        }

        List<Integer> list = new ArrayList<>();
        while(pq.size()>0){
            list.add(pq.remove().val);
        }

        Collections.sort(list);
        return list;
    }
}
