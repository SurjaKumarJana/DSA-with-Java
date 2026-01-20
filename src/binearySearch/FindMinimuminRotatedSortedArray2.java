package binearySearch;


/*
problem url: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

problem statement:
        Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
        For example, the array nums = [0,1,4,4,5,6,7] might become:

[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in
the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

You must decrease the overall operation steps as much as possible.
 */

public class FindMinimuminRotatedSortedArray2 {
    public int findMin(int[] arr) {

        int minimum = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length-1;

        while(low <= high){

            // calculate the middle index
            int mid = (low+high)/2;

            //edge case : arr[low] == arr[mid] == arr[high]
            if(arr[low] == arr[mid] && arr[mid] == arr[high] ){
                if(arr[mid] < minimum){
                    minimum = arr[mid];
                }
                //trim the search space
                low++;
                high--;
                continue;

            }

            // Check which part is sorted that you help to find the direction in which we need to move

            // left part is sorted
            if(arr[low] <= arr[mid]){
                //update the minimum element
                if(arr[low]<minimum){
                    minimum = arr[low];
                }
                //go right
                low = mid+1;
            }else{
                //update the minimum element
                if(arr[mid]<minimum){
                    minimum = arr[mid];
                }
                //go left
                high = mid-1;
            }

        }

        return minimum;

    }
}
