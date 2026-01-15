package binearySearch;
/*
    Given an array, arr[] sorted in ascending order and an integer k.
    Return true if k is present in the array, otherwise, false.
 */
public class BinearySearchInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int tar = 9;
        System.out.println(tar + " is present in arrary : "+ searchInSorted(arr,tar));
    }
    public static boolean searchInSorted(int nums[], int tar) {

        int low = 0;
        int high = nums.length -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] == tar ){
                return true;
            }else if(nums[mid] > tar){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return false;
    }
}
