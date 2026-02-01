package sortingAlgo.mergeSort;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1,3,7};
        int[] b = {2,4,5,6};
        int[] c = new int[a.length+b.length];

        merge(a,b,c);

        //printing result
        for(int x : c){
            System.out.print(x +" ");
        }
    }

    public static void merge(int[] a,int[] b,int[] c){

        //pointers
        int i =0,j=0,k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]) { c[k++] = a[i++]; }
            else{ c[k++] = b[j++];}
        }

        //copy the rest elements
        while(i<a.length){
            c[k++] = a[i++];
        }
        while(j<b.length){
            c[k++] = b[j++];
        }
    }
}
