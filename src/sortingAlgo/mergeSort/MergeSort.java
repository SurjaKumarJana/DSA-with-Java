package sortingAlgo.mergeSort;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1,3,2,6,4,7,8,8,1,9,-5};
        mergeSort(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;//base case

        //step 1: create two empty array of n/2 size
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        //copy the values from the initial array
        int idx =0;
        for(int i=0; i<a.length; i++){
            a[i] = arr[idx++];
        }
        for(int i=0; i<b.length; i++){
            b[i] = arr[idx++];
        }

        // sort this small arrays using recurssion
        mergeSort(a);
        mergeSort(b);

        //merge them to get the final ans;
        merge(a,b,arr);
    }

    public static void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
