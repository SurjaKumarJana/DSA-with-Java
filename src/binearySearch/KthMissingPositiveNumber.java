package binearySearch;

/*
problem url: https://leetcode.com/problems/kth-missing-positive-number/

problem statement:
        Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.
 */

public class KthMissingPositiveNumber {
    
    public int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length -1;

        while(low <= high){

            int mid = (high + low )/2;
            int noOfMissing = arr[mid] - (mid +1);// how many terms are missing

            // k terns are already missing before mid
            if(noOfMissing >= k){
                // go left
                high = mid -1;
            }
            // k th term will be in right side
            else{
                low = mid +1;
            }
        }

        return (high + 1) + k;
    }
}
