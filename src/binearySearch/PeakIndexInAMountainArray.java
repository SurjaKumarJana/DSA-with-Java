package binearySearch;
/*
852. Peak Index in a Mountain Array

    You are given an integer mountain array arr of length n where the values increase to a peak element
    and then decrease.

    Return the index of the peak element.

    Your task is to solve it in O(log(n)) time complexity.

 */
public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,6,5,2,1,-1,-3,-4,-11,-18};
        System.out.println( " Peak in array : "+ peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int low = 1;
        int high  = arr.length - 2;

        while(low <= high ){
            int mid = (low+high)/2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1] ){
                return mid;
            }
            else if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }

        return -1;
    }
}
