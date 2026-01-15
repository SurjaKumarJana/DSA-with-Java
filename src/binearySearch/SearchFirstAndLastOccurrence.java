package binearySearch;

/*
    Find First and Last Position of Element in Sorted Array
       Given an array of integers nums sorted in non-decreasing order,
       find the starting and ending position of a given target value.

       If target is not found in the array, return [-1, -1].

       You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchFirstAndLastOccurrence {

    public static void main(String[] args) {
        int[] arr = {1,2,2 ,2 ,2,2,2,2,3,3,3,3,4,4,4,4,5,6,7,8};
        int tar = 5;
        int[] result = firstAndLastOccurrenceSearch(arr,tar);
        System.out.println(" Occerence of "+ tar + " : " +
                        result[0]+ " and "+
                        result[1]
                );
    }
    public static int[] firstAndLastOccurrenceSearch(int[] nums, int tar) {
        //resulting array
        int[] result = new int[2];

        // first occurrence
        int low = 0;
        int high = nums.length -1;
        int firstIdx = -1;
        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] > tar){
                high = mid - 1;
            }else if(nums[mid] < tar){
                low = mid + 1;
            }else{
                firstIdx = mid;
                high = mid -1;
            }

        }

        //last occurrence
        low = 0;
        high = nums.length - 1;
        int lastIdx = -1;
        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] > tar){
                high = mid - 1;
            }else if(nums[mid] < tar ){
                low = mid + 1;
            }else{
                lastIdx = mid;
                low = mid +1;
            }
        }

        result[0] = firstIdx;
        result[1] = lastIdx;

        return result;

    }
}
