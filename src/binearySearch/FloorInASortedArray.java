package binearySearch;

/*
problem url:https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

problem statement:
        Given a sorted array arr[] and an integer x,
        find the index (0-based) of the largest element in arr[] that is less than or equal to x.
        This element is called the floor of x. If such an element does not exist, return -1.

Note: In case of multiple occurrences of floor of x, return the index of the last occurrence.
 */
public class FloorInASortedArray {


    public int findFloor(int[] arr, int tar) {
        // resulting index
        int idx = -1;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            //middle index
            int mid = (low + high)/2;

            if(arr[mid] > tar){
                //search in the left side
                high = mid - 1;
            }else{
                //update the index as it can be the possible ans
                idx = mid;
                // search right side as  more possible ans can exit
                low = mid + 1;

            }
        }

        return idx;

    }

}
