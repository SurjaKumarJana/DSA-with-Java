package heap.medium;

/*
problem url: https://leetcode.com/problems/top-k-frequent-elements/
 */

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    /*solution using min heap , TC = O(nlogK)
        -------------------------------------------        */
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //iterate and find the freq of element, tc-->O(n)
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        //iterate the hashmap and insert element into min heap , TC --> O(nlogk)
        for(int x : map.keySet()){
            int freq = map.get(x);
            pq.add(new Pair(x,freq));
            if(pq.size()>k) pq.remove();
        }

        //remove the element from heap and put it in the resulting array , TC --> O(klogk)
        int[] ans = new int[k];
        int idx = 0;
        while(!pq.isEmpty()){
            ans[idx] = pq.remove().ele;
            idx++;
        }

        return ans;
    }

}
