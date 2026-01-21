package array.questions;



public class ReverseAnArray {
    public void reverseArray(int arr[]) {
        int left =0;
        int right = arr.length - 1;

        while(left < right){
            //swapping the values
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            //moving the pointers toward center
            left++;
            right--;
        }

    }
}
