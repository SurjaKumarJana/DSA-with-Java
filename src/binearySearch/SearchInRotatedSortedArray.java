package binearySearch;


/*
problem url:https://leetcode.com/problems/search-in-rotated-sorted-array/

problem statement:
        There is an integer array nums sorted in ascending order (with distinct values).
        Prior to being passed to your function, nums is possibly left rotated at an unknown
        index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1],
        ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).

        For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 */
public class SearchInRotatedSortedArray {

    public int search(int[] arr, int tar) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low +(high - low)/2;

            //mid is target or not
            if(arr[mid] == tar){
                return mid;
            }

            //left part is sorted or not
            else if(arr[low] <= arr[mid]){
                //if low<tar<mid then go left , else go right
                if( arr[low] <= tar && tar < arr[mid]){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            //the right part sorted
            else{
                //if mid<tar<high then go right , else go left
                if( arr[mid] < tar && tar <= arr[high]){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        //the element is not present in this array
        return -1;

    }

}
