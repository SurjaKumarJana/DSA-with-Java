package binearySearch;
/*
    Given a sorted array arr[] and an integer k,
    find the position(0-based indexing) at which k is present in the array using binary search.
    If k doesn't exist in arr[] return -1.

    Note: If multiple occurrences are there, please return the smallest index.
 */
public class SearchFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int tar = 9;
        System.out.println("first Occerence of "+ tar + " : " +firstOccurrenceSearch(arr,tar));
    }

    public static  int firstOccurrenceSearch(int[] arr, int tar) {
        int low =0 ;
        int high = arr.length - 1;
        int idx = -1;

        while(low <= high){
            int mid = (low +high)/2;
            if(arr[mid] > tar){
                high = mid - 1;
            }
            else if (arr[mid] < tar){
                low = mid + 1;
            }
            else{
                idx = mid;
                high = mid - 1;
            }
        }
        return idx;
    }
}
