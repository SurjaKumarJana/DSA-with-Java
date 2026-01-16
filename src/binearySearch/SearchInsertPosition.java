package binearySearch;

/*
problem url :https://leetcode.com/problems/search-insert-position/

problem statement :
        Given a sorted array of distinct integers and a target value,
        return the index if the target is found.
        If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition {


    public int searchInsert(int[] arr, int tar) {

        // resulting index
        int idx = 0;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            //middle index
            int mid = (low + high)/2;

            if(arr[mid] == tar){
                //element found return index
                return mid;
            }else if(arr[mid] > tar){
                //search in the left side
                high = mid - 1;
            }else{
                //update the index as it can be the possible ans
                idx = mid + 1;// adding 1 as we need to return the possition where we will add the value
                // search right side as  more possible ans can exit
                low = mid + 1;
            }
        }

        return idx;

    }
}
