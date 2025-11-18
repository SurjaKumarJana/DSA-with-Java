package array.questions;

/*
Given an sorted array arr[] of integers.
Sort the array into a wave-like array(In Place).
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] .....
and so on. If there are multiple solutions, find the lexicographically smallest one.

Note: The given array is sorted in ascending order, and modify the given array in-place
without returning a new array.
 */
public class WaveArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        sortInWave(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    public static void sortInWave(int arr[]) {
        int n = arr.length;
        // we need to swap after one position
        for(int i =0 ; i<n-1 ; i++){
            if(i%2 == 0){
                swap(arr,i ,i+1);
            }
        }


    }

    public static void swap(int arr[], int i , int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
}
