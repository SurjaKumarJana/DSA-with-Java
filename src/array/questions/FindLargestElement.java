package array.questions;

public class FindLargestElement {

    public static void main(String[] args) {
        int[] arr = {1,2,43,5,6,3};

        int largest = arr[0];
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        System.out.println("Largest element is : "+largest);
    }
}
