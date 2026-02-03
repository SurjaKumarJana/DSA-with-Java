package sortingAlgo.cyclicSort;


/*
problem url: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

problem statement:
       You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n
       (inclusive). This array represents a permutation of the integers from 1 to n with one element missing.
       Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ arr.size() + 1

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
 */

public class MissingElement {
    int missingNum(int arr[]) {
        int n = arr.length +1;
        int i =0;

        while(i< arr.length){
            if(arr[i] == i+1 || arr[i]==n) i++;
            else{
                int idx = arr[i]-1;
                swap(arr,i,idx);
            }
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1) return j+1;
        }


        return n;
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
