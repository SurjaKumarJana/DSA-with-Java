package setAndMap.easy;

/*
problem url: https://www.geeksforgeeks.org/problems/find-distinct-elements--130928/1
 */


import java.util.HashSet;

/*      solution using hashSet, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class CountDistinctInArray {
    public int countDistinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        return set.size();
    }
}
