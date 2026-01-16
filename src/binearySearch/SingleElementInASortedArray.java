package binearySearch;

/*
problem url:https://leetcode.com/problems/single-element-in-a-sorted-array/

problem statement:
        You are given a sorted array consisting of only integers
        where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.
 */


public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] arr) {

        int n = arr.length;

        //edge cases
        if(n == 1){ return arr[0];}
        if(arr[0] != arr[1]){ return arr[0];}
        if(arr[n-1] != arr[n-2]){return arr[n-1];}

        // search element in the rest of the array
        //algo : if number of element in left side is odd , go left
        //       else go left

        int low = 1;
        int high = n-2;

        while(low <= high){

            int mid = low + (high - low)/2;

            // check if the mid is the single element or not
            if( arr[mid-1] != arr[mid] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            // keep track of order of occurrence
            int f =mid;// first occurrence
            int s = mid;// second occurrence

            if(arr[mid-1] == arr[mid]){
                f = mid - 1;
            }else{
                s = mid + 1;
            }


            //count left and right elements number
            int leftCount = f ;
            int rightCount = n-1-s;

            //if odd elements are in left side of first occurrence
            if((leftCount % 2) != 0){
                //go left
                high = f - 1;

            }
            else{// odd elements are in right side of second occurrence
                //go right
                low = s + 1;
            }
        }

        return -1;

    }

}
