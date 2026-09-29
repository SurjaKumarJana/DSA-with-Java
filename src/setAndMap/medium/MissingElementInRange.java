package setAndMap.medium;


/*
problem url: https://www.geeksforgeeks.org/problems/missing-element-in-range/1
 */


import java.util.ArrayList;
import java.util.HashSet;

/*      solution using HashSet, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class MissingElementInRange {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        HashSet<Integer> set = new HashSet<>();
        //inserting elements in set ..... TC  == O(n)
        for(int x : arr) {
            set.add(x);
        }
        int element = low;
        ArrayList<Integer> list = new ArrayList<>();
        while(element <= high){
            if(!set.contains(element)) list.add(element);
            element++;
        }
        return list;
    }
}
