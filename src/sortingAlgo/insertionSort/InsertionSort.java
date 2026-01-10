package sortingAlgo.insertionSort;

import helperCode.CustomCode;

public class InsertionSort {
    public static void main(String[] args) {
        //int[] arr = {1,4,2,4,2,6,3,9,5,7,5,8};
        int[] arr ={5,4,3,2,1};
        insertionSort(arr);
        CustomCode.printArray(arr);
    }
    public static void insertionSort(int[] arr) {
        // code here
        int n = arr.length;

        //outer loop , represent passes
        for(int i =1; i<n ; i++){

            //we will insert this key at the correct possition
            int key = arr[i];
            int j = i-1;

            //inner loop for inserting elements from unsorted section to the sorted section
            while(j>=0 && arr[j]>key){

                //shift the j th value to the right side
                arr[j+1] = arr[j];

                //decrease j to point next element
                j--;
            }
            arr[j+1] =key;

        }
    }
}
