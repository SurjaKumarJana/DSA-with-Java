package sortingAlgo;

/*
Given an array arr[], check whether it is sorted in non-decreasing order.
Return true if it is sorted otherwise false.

 */

public class CheckIfSorted {

    public static boolean isSorted(int[] arr) {
        //logic is :
        /*
            iterate over the list check if the numbers
            are increasing or decreasing continuously or not
        */
        int n = arr.length;

        for(int i=0 ; i< n-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50, 60};
        System.out.println("result : "+ isSorted(arr));
    }
}
