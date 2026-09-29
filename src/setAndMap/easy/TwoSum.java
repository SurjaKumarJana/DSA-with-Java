package setAndMap.easy;

/*
problem url: https://www.geeksforgeeks.org/problems/key-pair5616/1
 */


import java.util.HashSet;

/*      solution using hashSet, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class TwoSum {
    boolean twoSum(int arr[], int tar) {
        HashSet<Integer> set = new HashSet();
        for(int i = 0;i<arr.length; i++){
            if(set.contains(tar - arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
