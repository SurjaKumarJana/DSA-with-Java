package sortingAlgo.selectionSort;
import helperCode.CustomCode;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,4,2,6,3,9,5,7,5,8};
        selectionSort(arr);
        CustomCode.printArray(arr);
    }
    public  static void selectionSort(int[] arr) {

        //logic :
        /*
        1. start with the first element , scan the entire list to find the smalllest element
        2. bring the smallest element to the front in every pass
        */

        int n = arr.length;

        //outer loop or passes
        for(int i =0 ; i<n ; i++){

            int minIdx = i;// we need index to swap the values

            //inner loop that will scan the entir list in every pass
            //after a pass we bring one small element at begining so we need to scan after
            //that possition
            for(int j =i+1; j<n; j++){

                if(arr[j]<arr[minIdx]){
                    //update the min
                    minIdx = j;
                }

            }

            // now bring the smallest element at i th possition
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }


    }

}
