package setAndMap.medium;

/*
problem url: https://www.geeksforgeeks.org/problems/count-pairs-in-array-divisible-by-k/1
 */

import java.util.*;

/*      solution using HashMap, TC = O(n), SC --> O(k)
    -------------------------------------------        */
public class CountPairsDivisibleByK {

    public int countKdivPairs(int[] arr, int k) {
        HashMap<Integer ,Integer> map = new HashMap<>();

        //iterate through the array and keep track modulus of elements and freq
        for(int ele : arr){
            int x = ele % k;
            map.put(x, map.getOrDefault(x,0)+1);
        }

        int pairs = 0;

        //count the 0 remainder pairs
        int zeroCount = map.getOrDefault(0,0);
        pairs += (zeroCount*(zeroCount-1))/2;

        //count the k/2 remainder pairs
        if(k%2 ==0){
            int halfCount = map.getOrDefault(k/2,0);
            pairs += (halfCount*(halfCount-1))/2;
            if(map.containsKey(k/2)) map.remove(k/2);
        }

        pairs = pairs*2;

        //iterate and get all the pairs.
        for(int x : map.keySet()){
            pairs += map.getOrDefault(x,0)*map.getOrDefault(k-x,0);
        }

        return pairs/2;

    }
}
