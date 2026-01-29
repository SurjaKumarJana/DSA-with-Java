package recursion;


/*
problem url: https://leetcode.com/problems/binary-search/

problem statement:
       Given an array of integers nums which is sorted in ascending order,
       and an integer target, write a function to search target in nums.
        If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1


 */
public class BinarySearch {

    //binery search using recurssion
    public int search(int[] nums, int tar) {
        int low =0;
        int high =nums.length-1;

        return recSearch(nums,tar,low,high);

    }
    public int recSearch(int[] arr, int tar,int low, int high){
        int mid = (low+high)/2;

        if(low > high) return -1;

        if(arr[mid] == tar) return mid;
        else if(arr[mid] > tar) return recSearch(arr,tar,low,mid-1); //go left
        else return recSearch(arr,tar,mid+1,high); //go right

    }
}
