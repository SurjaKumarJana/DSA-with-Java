package sortingAlgo.cyclicSort;

/*
problem url: https://leetcode.com/problems/first-missing-positive/

problem statement:
      Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.


Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
 */

public class FirstMissingPositive {
    public int firstMissingPositive(int[] arr) {
        int i =0;
        while(i<arr.length){
            if(arr[i]<=0 || arr[i]>arr.length || arr[i]==arr[arr[i]-1] ) i++; //skipp
            else{
                swap(arr,i,arr[i]-1);//move current element at the right place
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1) return i+1;
        }

        return arr.length+1;
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
