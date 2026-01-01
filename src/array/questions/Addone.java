package array.questions;


/*
Given a non-negative number represented as an array of digits.
The task is to add 1 to the number (increment the number represented by the digits by 1).
The digits are stored such that the most significant digit is the first element of the array.
 */


public class Addone {

    static int[] addOne(int[] arr) {


        int carry = 1;

        if(arr[arr.length -1] != 9){
            arr[arr.length-1]++;
            return arr;
        }

        for(int i = arr.length - 1; i >= 0; i--) {

            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }


        if(carry > 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = carry;
            System.arraycopy(arr, 0, newArr, 1, arr.length);
            return newArr;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9,9};
        int[] res = addOne(arr);
        for(int i : res) {
            System.out.print(i);
        }
    }
}
