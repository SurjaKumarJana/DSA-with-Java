package sortingAlgo.mergeSort;



/*
problem url: https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

problem statement:
       Given an array of integers arr[]. You have to find the Inversion Count of the array.
Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104
 */


public class InversionCount {

    static int inversionCount(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        return mergeSort(arr, temp, 0, n - 1);
    }

    static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int count = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid + 1, right);
            count += merge(arr, temp, left, mid, right);
        }
        return count;
    }

    static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;     // left subarray
        int j = mid + 1;  // right subarray
        int k = left;
        int count = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }
}
