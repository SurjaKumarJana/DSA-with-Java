package binearySearch;

/*
problem url: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

problem statement:
       Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
       For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time
results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

 */

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] arr) {

        int low = 0;
        int high = arr.length-1;

        while(low < high){
            int mid = (low+high)/2;

            //smallest element is in the right side
            if( arr[mid] > arr[high]){
                //go right
                low = mid+1;
            }else{
                // go left
                high = mid;
            }
        }

        // when the loop breakes, low will point to the smallest element
        return arr[low];
    }
}
